package io.zipcoder.RedditApp.Model;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by MarzuwqM on 11/30/15.
 */

public class RedditHttpRequest {

    public String getRedditData(String urlRed){
        String line = "";
        try {
            URL url = new URL(urlRed);
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            line = in.readLine();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONPObject jsonpObject = new JSONPObject()
        return line;
    }
}
