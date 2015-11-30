package io.zipcoder.RedditApp.Controller;

import io.zipcoder.RedditApp.Model.RedditLink;
import io.zipcoder.RedditApp.Model.RedditLinkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by MarzuwqM on 11/24/15.
 */
@Controller
public class RedditController {
   @Autowired
    private RedditLinkDAO redditDAO;
    RedditLink redditLink = new RedditLink();
    ArrayList<RedditLink> dummyListofLinks = new ArrayList<>();

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<RedditLink> searchBox(@RequestParam String search){
        dummyListofLinks.add(redditLink);
        System.out.println(search);
        return dummyListofLinks;

    }
}