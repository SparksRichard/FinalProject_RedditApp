package io.zipcoder.RedditApp.Controller;

import io.zipcoder.RedditApp.Model.RedditLink;
import io.zipcoder.RedditApp.Model.RedditLinkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by MarzuwqM on 11/24/15.
 */
@Controller
public class RedditController {
   @Autowired
    private RedditLinkDAO redditDAO;
    RedditLink redditLink;
    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ArrayList<RedditLink> searchBox(@RequestBody String search){
        System.out.println(search);
        return null;

    }
}
