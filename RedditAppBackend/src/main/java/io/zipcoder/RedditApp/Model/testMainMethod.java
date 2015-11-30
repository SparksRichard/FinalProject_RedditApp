package io.zipcoder.RedditApp.Model;

/**
 * Created by MarzuwqM on 11/30/15.
 */
public class testMainMethod {

    public static void main(String[] args) {
        RedditHttpRequest redditHttpRequest = new RedditHttpRequest();


        System.out.println(redditHttpRequest.getRedditData("http://www.reddit.com/.json"));
    }
}
