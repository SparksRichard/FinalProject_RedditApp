package io.zipcoder.RedditApp.Model;

import javax.persistence.Entity;

<<<<<<< HEAD
=======
import javax.persistence.*;
import javax.validation.constraints.NotNull;
>>>>>>> zooqini
import java.sql.Date;

/**
 * Created by rsparks on 11/25/15.
 */
@Entity
@Table(name = "SubredditReferences")
public class SubredditReference {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String search;
    @NotNull
    private Date time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public SubredditReference(long id, String search, Date time){
        this.id = id;
        this.search = search;
        this.time = time;
    }
    public SubredditReference(){ }

}
