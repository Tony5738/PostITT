package model.entities;

/**
 * Created by antho_000 on 30/11/2016.
 */
public class Post {

    private int postId;

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    private String postText;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

}
