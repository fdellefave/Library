package it.fdellefave.library.repository;

import it.fdellefave.library.model.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity,Integer> {

//    public Book findByDescriptionAndIdOrderOrderByPrice(String description, int id);
//
//    @Query("SELECT b FROM book b WHERE description = :parametro1 and id = :parametro2")
//    List<Book> findByDescAndidBook(@Param("parametro1") String descrizione, @Param("parametro2") int id);
//
//    @Query(value = "SELECT * FROM library.book WHERE description = :parametro1 and id = :parametro2", nativeQuery = true)
//    List<Book> findByDescrizioneAndidlibro(@Param("parametro1") String descrizione, @Param("parametro2") int id);

}