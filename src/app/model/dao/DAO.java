package app.model.dao;

import java.util.List;

/**
 * Created by antho_000 on 30/11/2016.
 */
public interface DAO<E> {

    //Allow the insertion in the database
    //public E create();

    //Allow to find an element in the database
    public E find(int id);

    //Allow to find All element in the database
    public List<E> findAll();

    //Allow the insertion in the database
    public E save(E e);

}
