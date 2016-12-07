package app.model.dao;

import app.model.entities.ITTUser;

/**
 * Created by antho_000 on 30/11/2016.
 */
public interface ITTUserDAO extends DAO<ITTUser>{

    public int login(String email,String password);

    public ITTUser refreshScore();

}
