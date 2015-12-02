package io.zipcoder.RedditApp.Model;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


/**
 * Created by rsparks on 11/25/15.
 */
public interface RedditLinkDAO extends CrudRepository<RedditLink, Integer> {
    ArrayList<RedditLink> findAllBySearchid(long searchid);
}
