package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by MarzuwqM on 11/30/15.
 */
@Service
public class RedditHttpRequest {
    @Autowired
    private RedditParser redditParser;

    private ArrayList<RedditLink> redditResponseOf25Links;
    private HttpResponse<JsonNode> response;
    private long requestDate = (new Date()).getTime();

    public ArrayList<RedditLink> getRedditDataWrapper(String sub, long requestNumber) throws InterruptedException {
        ArrayList<RedditLink> returnValue = getRedditData(sub, requestNumber);

        if(returnValue == null) {
            Thread.sleep(3000);
            returnValue = getRedditData("", requestNumber);
        }

        return returnValue;
    }

    public ArrayList<RedditLink> getRedditData(String sub, long requestNumber) {
        long currentDate= (new Date()).getTime();
        requestDate = currentDate;
        response = null;
        if (!"".equals(sub)) {
            sub = "r/" + sub;
        }
        response = httpRequest(sub);
        if (!response.getBody().getObject().getJSONObject("data").getJSONArray("children").isNull(0)) {
            redditResponseOf25Links = redditParser.parseData(response, requestNumber);
            return redditResponseOf25Links;
        }
        else {
            return null;
        }
    }
    public HttpResponse<JsonNode> httpRequest(String sub){
        try {
            response = Unirest.get("https://www.reddit.com/{sub}.json")
                    .routeParam("sub", sub)
                    .asJson();
        } catch (Exception e) {
            System.out.println("Request failed");
        }
        return response;
    }

    public RedditParser getRedditParser() {
        return redditParser;
    }

    public void setRedditParser(RedditParser redditParser) {
        this.redditParser = redditParser;
    }

    public ArrayList<RedditLink> getRedditResponseOf25Links() {
        return redditResponseOf25Links;
    }

    public void setRedditResponseOf25Links(ArrayList<RedditLink> redditResponseOf25Links) {
        this.redditResponseOf25Links = redditResponseOf25Links;
    }

    public HttpResponse<JsonNode> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<JsonNode> response) {
        this.response = response;
    }

    public long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(long requestDate) {
        this.requestDate = requestDate;
    }
}
