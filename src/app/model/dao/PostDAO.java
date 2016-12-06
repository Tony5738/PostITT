package app.model.dao;

import app.model.entities.Media;
import app.model.entities.Post;

/**
 * Created by antho_000 on 30/11/2016.
 */
public interface PostDAO extends DAO<Post> {

    public Media getMedia();


}
