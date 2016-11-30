package model.dao;

import model.entities.Media;
import model.entities.Post;

/**
 * Created by antho_000 on 30/11/2016.
 */
public interface PostDAO extends DAO<Post> {

    public Media getMedia();


}
