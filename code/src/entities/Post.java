package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    public Post() {

    }

    private List<Comment> comments = new ArrayList<>();

    public Post(java.util.Date date, String title, String content, Integer likes) {
        this.moment = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment Comment) {
        comments.add(Comment);
    }

    public void removeComment(Comment Comment) {
        comments.remove(Comment);
    }

}
