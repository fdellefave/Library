package it.fdellefave.library.service.implement;



import it.fdellefave.library.model.BookCategoryEntity;
import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.repository.BookCategoryRepository;
import it.fdellefave.library.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookCategoryServiceImplement implements BookCategoryService {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @Override
    public Iterable<BookCategoryEntity> getAll() {
        return bookCategoryRepository.findAll();
    }

    @Override
    public Optional<BookCategoryEntity> getById(int id) {
        return bookCategoryRepository.findById(id);
    }

    @Override
    public BookCategoryEntity create(BookCategoryEntity bookCategory) {
        BookCategoryEntity bookCategoryCreate = new BookCategoryEntity("Narrativa");
        return bookCategoryRepository.save(bookCategoryCreate);
    }

    @Override
    public Optional<BookCategoryEntity> update(int id, BookCategoryEntity bookCategory) {

        Optional<BookCategoryEntity> foundBookCategory = bookCategoryRepository.findById(id);

        if(!(foundBookCategory.isPresent())){
            return Optional.empty();
        }

        foundBookCategory.get().setCategory(bookCategory.getCategory());

        bookCategoryRepository.save(foundBookCategory.get());

        return foundBookCategory;
    }


    @Override
    public Boolean delete(int id) {

        Optional<BookCategoryEntity> foundBookCategory = bookCategoryRepository.findById(id);

        if(foundBookCategory.isPresent()){
            bookCategoryRepository.delete(foundBookCategory.get());
        }
        return false;
    }
}
