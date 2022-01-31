package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.repository.BookCategoryRepository;
import it.fdellefave.library.repository.BookNumberRepository;
import it.fdellefave.library.repository.BookRepository;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class BookServiceImplement implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepo;

    @Autowired
    private BookNumberRepository bookNumberRepo;



    public Iterable<BookEntity> getAll() {

        return bookRepository.findAll();
    }

    @Override
    public Optional<BookEntity> getById(int id) {

        return bookRepository.findById(id);
    }

    @Override
    public BookEntity create(BookEntity book) {

        BookEntity bookCreate = new BookEntity(
                book.getTitle(),
                book.getDescription(),
                book.getPrice(),
                book.getQuantity(),
                bookCategoryRepo.findById(book.getBookCategoryEntity().getIdBookCategory())
                        .orElseThrow(()-> new EntityNotFoundException("Categoria non trovata")),
                bookNumberRepo.findById(book.getBookNumberEntity().getIdBookNumber())
                        .orElseThrow(()-> new EntityNotFoundException("ISBN non trovato"))
        );

        return bookRepository.save(bookCreate);
    }


    @Override
    public Optional<BookEntity> update(int id, BookEntity book) {

        Optional<BookEntity> foundBook = bookRepository.findById(id);

        if(!(foundBook.isPresent())){
            return Optional.empty();
        }

        foundBook.get().setTitle(book.getTitle());
        foundBook.get().setDescription(book.getDescription());
        foundBook.get().setPrice(book.getPrice());
        foundBook.get().setQuantity(book.getQuantity());
        foundBook.get().setBookCategoryEntity(bookCategoryRepo.findById(book.getBookCategoryEntity().getIdBookCategory())
                .orElseThrow(()->new EntityNotFoundException("Categoria non trovata")));
        foundBook.get().setBookNumberEntity(bookNumberRepo.findById(book.getBookNumberEntity().getIdBookNumber())
                .orElseThrow(()-> new EntityNotFoundException("ISBN non trovato")));

        bookRepository.save(foundBook.get());

        return foundBook;
    }

    @Override
    public Boolean delete(int id) {

        Optional<BookEntity> foundBook = bookRepository.findById(id);

        if(foundBook.isPresent()){
            bookRepository.delete(foundBook.get());
        }

        return false;
    }
}



