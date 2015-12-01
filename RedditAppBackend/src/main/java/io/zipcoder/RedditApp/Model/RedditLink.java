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
    private long searchid;

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

    public long getSearchid() {
        return searchid;
    }

    public void setSearchid(long searchid) {
        this.searchid = searchid;
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


    public RedditLink(long searchid, String author, long numcomments, Boolean over18, String permalink, long score, String subreddit, String thumbnail, String title, String url){
        this.searchid = searchid;
        this.author = author;
        this.numcomments = numcomments;
        this.over18 = over18;
        this.permalink = permalink;
        this.score = score;
        this.subreddit = subreddit;
        this.thumbnail = thumbnail;
        this.title = title;
        this.url = url;
    }
    public RedditLink(){ }


}
