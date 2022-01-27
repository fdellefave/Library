package it.fdellefave.library.adapter;


import java.util.Optional;

public interface ServiceAdapter<T> {

    Iterable<T> getAll();

    Optional<T> getById(int id);

    T create(T book);

    Optional<T> update(int id, T entity);

    Boolean delete(int id);

}
