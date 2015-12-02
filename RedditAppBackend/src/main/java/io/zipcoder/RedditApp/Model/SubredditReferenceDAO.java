package io.zipcoder.RedditApp.Model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by rsparks on 12/1/15.
 */
public interface SubredditReferenceDAO extends CrudRepository<SubredditReference, Integer> {
    SubredditReference findBySearch(String search);
}
