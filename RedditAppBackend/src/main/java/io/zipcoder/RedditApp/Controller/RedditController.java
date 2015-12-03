package io.zipcoder.RedditApp.Controller;

import io.zipcoder.RedditApp.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by MarzuwqM on 11/24/15.
 */
@Controller
public class RedditController {

    @Autowired
    private SubredditReferenceDAO subredditReferenceDAO;

    @Autowired
    private RedditLinkDAO redditLinkDAO;

    @Autowired
    private RedditHttpRequest redditHttpRequest;

    ArrayList<RedditLink> redditLinkArrayList;
    SubredditReference subredditReference;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<RedditLink> searchBox(@RequestParam String search){
        Date date = new Date();
        long currentTime = date.getTime();



        if(currentTime-redditHttpRequest.getRequestDate()>3000) {
            subredditReference = subredditReferenceDAO.findBySearch(search);
            if (subredditReference == null) {
                subredditReference = new SubredditReference(search);
                subredditReferenceDAO.save(subredditReference);
            } else {
                redditLinkDAO.delete(redditLinkDAO.findAllBySearchid(subredditReference.getId()));
            }

            try {
                redditLinkArrayList = redditHttpRequest.getRedditDataWrapper(search, subredditReference.getId());
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
            return redditLinkArrayList;
        }
        subredditReference = subredditReferenceDAO.findBySearch("");
        return (ArrayList<RedditLink>)redditLinkDAO.findAllBySearchid(subredditReference.getId());
    }
}