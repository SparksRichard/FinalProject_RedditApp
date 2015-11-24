package io.zipcoder.RedditApp.Model;


import javax.validation.constraints.NotNull;

/**
 * Created by MarzuwqM on 11/24/15.
 */

public class RedditApp {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private long id;

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

    public long getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(long num_comments) {
        this.num_comments = num_comments;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Boolean getOver_18() {
        return over_18;
    }

    public void setOver_18(Boolean over_18) {
        this.over_18 = over_18;
    }

    public String getSubreddit() {
        return Subreddit;
    }

    public void setSubreddit(String subreddit) {
        Subreddit = subreddit;
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

    @NotNull
    private String author;

    @NotNull
    private long num_comments;

    @NotNull
    private Boolean over_18;

    @NotNull
    private String permalink;

    @NotNull
    private long score;

    @NotNull
    private String Subreddit;

    @NotNull
    private String thumbnail;

    @NotNull
    private String title;

    @NotNull
    private String url;

    public RedditApp(String author0, long num_comments0, Boolean over_180, String permalink0, long score0, String Subreddit0, String thumbnail0, String title0, String url0){
        this.author = author0;
        this.num_comments = num_comments0;
        this.over_18 = over_180;
        this.permalink = permalink0;
        this.score = score0;
        this.Subreddit = Subreddit0;
        this.thumbnail = thumbnail0;
        this.title = title0;
        this.url = url0;
    }
    public RedditApp(){ }

}
