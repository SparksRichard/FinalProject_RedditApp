package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rsparks on 11/30/15.
 */
@Service
public class RedditParser {

    @Autowired
    private RedditLinkDAO redditLinkDAO;

    public void parseData(HttpResponse<JsonNode> rawData){

        JSONArray redditPosts = rawData.getBody().getObject().getJSONObject("data").getJSONArray("children");
        for(int i=0; i<25; i++){
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
            //RedditLink tempLink = new RedditLink(author, numberOfComments, over18, permaLink, score, subReddit, thumbnail, title, url//rest of the variables, don't worry about searchid for now
             //);
        }
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("author"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getLong("num_comments"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getBoolean("over_18"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("permalink"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getLong("score"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("subreddit"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("thumbnail"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("title"));
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getString("url"));

    }
}
