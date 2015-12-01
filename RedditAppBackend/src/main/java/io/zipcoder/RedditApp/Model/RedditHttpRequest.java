package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MarzuwqM on 11/30/15.
 */

public class RedditHttpRequest {
    RedditParser redditParser = new RedditParser();
    private HttpResponse<JsonNode> response;
    public void getRedditData(String sub){
        try{
            response = Unirest.get("https://www.reddit.com/r/{sub}.json")
                    .routeParam("sub", sub)
                    .asJson();
        }catch(Exception e) {
            System.out.println(e);
        }
        redditParser.parseData(response);
    }

    public HttpResponse<JsonNode> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<JsonNode> response) {
        this.response = response;
    }

}
