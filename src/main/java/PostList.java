package main.java;

import java.time.LocalDate;

public class PostList {
    private String title;
    private String post;

    private String date;

    public PostList(String title, String post, String date) {
        this.title = title;
        this.post = post;
        this.date = date;
    }

    public PostList() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PostList{" +
                "date=" + date +
                '}';
    }
}






