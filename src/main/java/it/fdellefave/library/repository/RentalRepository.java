package it.fdellefave.library.repository;

import it.fdellefave.library.model.RentalEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<RentalEntity,Integer> {

//    public Book findByDescriptionAndIdOrderOrderByPrice(String description, int id);
//
//    @Query("SELECT b FROM book b WHERE description = :parametro1 and id = :parametro2")
//    List<Book> findByDescAndidBook(@Param("parametro1") String descrizione, @Param("parametro2") int id);
//
//    @Query(value = "SELECT * FROM library.book WHERE description = :parametro1 and id = :parametro2", nativeQuery = true)
//    List<Book> findByDescrizioneAndidlibro(@Param("parametro1") String descrizione, @Param("parametro2") int id);
//
//    @QUA DEVI FA A QUERY
//    public List<BookEntity> prenotaLibroRepository();



}