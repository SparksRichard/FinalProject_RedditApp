package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by rsparks on 11/30/15.
 */
@Service
public class RedditParser {

    @Autowired
    RedditLinkDAO redditLinkDAO;

    public  ArrayList<RedditLink> parseData(HttpResponse<JsonNode> rawData, long requestNumber){
    ArrayList<RedditLink> redditLinks = new ArrayList<>();
    JSONArray redditPosts = rawData.getBody().getObject().getJSONObject("data").getJSONArray("children");

        for(int i=0; i<redditPosts.length(); i++){

            JSONObject tempData = redditPosts.getJSONObject(i).getJSONObject("data");

            String author = tempData.getString("author");
            Long numberOfComments = tempData.getLong("num_comments");
            Boolean over18 = tempData.getBoolean("over_18");
            String permaLink = tempData.getString("permalink");
            Long score = tempData.getLong("score");
            String subReddit = tempData.getString("subreddit");
            String thumbnail = tempData.getString("thumbnail");
            String title = tempData.getString("title");
            String url = tempData.getString("url");

            RedditLink tempLink = new RedditLink(requestNumber, author, numberOfComments, over18, permaLink, score, subReddit, thumbnail, title, url);
            redditLinkDAO.save(tempLink);
            redditLinks.add(tempLink);
        }
        return redditLinks;
    }
}
