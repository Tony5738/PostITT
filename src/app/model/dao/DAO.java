package app.model.dao;

/**
 * Created by antho_000 on 30/11/2016.
 */
public interface DAO<E> {

    //Allow the insertion in the database
    //public E create();

    //Allow to find an element in the database
    public E find();

    //Allow the insertion in the database
    public E save();

}
