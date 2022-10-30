package Main;

import java.time.LocalDate;

public class PostList {
    /**
     * Denna klass skapar objektet för inlägget som användaren kan göra i dagboken
     */
    private String date;
    private String title;
    private String post;

    //Konstruktor
    public PostList(String date, String title, String post) {
        this.date = date;
        this.title = title;
        this.post = post;
    }

    //Tom konstruktor
    public PostList() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //toString
    @Override
    public String toString() {
        return "PostList{" +
                "date=" + date +
                '}';
    }

    //Getter och setter
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


}






