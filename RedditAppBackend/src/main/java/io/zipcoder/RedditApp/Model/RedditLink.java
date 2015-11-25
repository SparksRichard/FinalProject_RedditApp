package io.zipcoder.RedditApp.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by MarzuwqM on 11/24/15.
 */
@Entity
@Table(name = "RedditLinks")
public class RedditLink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String author;

    @NotNull
    private long numcomments;

    @NotNull
    private Boolean over18;

    @NotNull
    private String permalink;

    @NotNull
    private long score;

    @NotNull
    private String subreddit;

    @NotNull
    private String thumbnail;

    @NotNull
    private String title;

    @NotNull
    private String url;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumcomments() {
        return numcomments;
    }

    public void setNumcomments(long numcomments) {
        this.numcomments = numcomments;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        subreddit = subreddit;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public RedditLink(String author0, long num_comments0, Boolean over_180, String permalink0, long score0, String subreddit0, String thumbnail0, String title0, String url0){
        this.author = author0;
        this.numcomments = num_comments0;
        this.over18 = over_180;
        this.permalink = permalink0;
        this.score = score0;
        this.subreddit = subreddit0;
        this.thumbnail = thumbnail0;
        this.title = title0;
        this.url = url0;
    }
    public RedditLink(){ }

}
