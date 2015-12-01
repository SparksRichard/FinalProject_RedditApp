package io.zipcoder.RedditApp.Model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

/**
 * Created by MarzuwqM on 11/30/15.
 */
public class testMainMethod {

    public static void main(String[] args) {
        RedditHttpRequest redditHttpRequest = new RedditHttpRequest();
        redditHttpRequest.getRedditData("gaming");
    }
}
