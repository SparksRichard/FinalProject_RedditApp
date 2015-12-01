package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by rsparks on 11/30/15.
 */
public class RedditParser {

    public void parseData(HttpResponse<JsonNode> rawData){

        JSONArray redditPosts = rawData.getBody().getObject().getJSONObject("data").getJSONArray("children");
        for(int i=0; i<25; i++){
            JSONObject tempData = redditPosts.getJSONObject(i).getJSONObject("data");
            String author = tempData.getString("author");
            RedditLink tempLink = new RedditLink(author, //rest of the variables, don't worry about searchid for now
             );
        }
        System.out.println(redditPosts.getJSONObject(0).getJSONObject("data").getBoolean("author"));
    }
}
