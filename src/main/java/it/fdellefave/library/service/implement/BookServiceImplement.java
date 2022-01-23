package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.Book;
import it.fdellefave.library.repository.BookRepository;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImplement implements BookService {

    @Autowired
    private BookRepository bookRepository;


    public Iterable<Book> getAll() {

        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getById(int id) {

        return bookRepository.findById(id);
    }

    @Override
    public Book create(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> update(int id, Book book) {

        Optional<Book> foundBook = bookRepository.findById(id);

        if(!(foundBook.isPresent())){
            return Optional.empty();
        }

        foundBook.get().setTitle(book.getTitle());
        foundBook.get().setAuthor(book.getAuthor());
        foundBook.get().setPrice(book.getPrice());

        bookRepository.save(foundBook.get());

        return foundBook;
    }

    @Override
    public Boolean delete(int id) {

        Optional<Book> foundBook = bookRepository.findById(id);

        if(foundBook.isPresent()){
            bookRepository.delete(foundBook.get());
        }

        return false;
    }

}
