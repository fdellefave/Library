package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.BookNumberEntity;
import it.fdellefave.library.repository.BookNumberRepository;
import it.fdellefave.library.repository.BookRepository;
import it.fdellefave.library.service.BookNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookNumberServiceImplement implements BookNumberService {

    @Autowired
    private BookNumberRepository bookNumberRepository;


    @Override
    public Iterable<BookNumberEntity> getAll() {
        return bookNumberRepository.findAll();
    }

    @Override
    public Optional<BookNumberEntity> getById(int id) {
        return bookNumberRepository.findById(id);
    }

    @Override
    public BookNumberEntity create(BookNumberEntity bookNumber) {

        BookNumberEntity bookNumberCreate= new BookNumberEntity(
                bookNumber.getIsbnCode()
                );
       return bookNumberRepository.save(bookNumberCreate);
    }

    @Override
    public Optional<BookNumberEntity> update(int id, BookNumberEntity bookNumber) {

        Optional<BookNumberEntity> foundBookNumber = bookNumberRepository.findById(id);

        if(!(foundBookNumber.isPresent())){
            return Optional.empty();
        }

        foundBookNumber.get().setIsbnCode(bookNumber.getIsbnCode());

        return foundBookNumber;
    }

    @Override
    public Boolean delete(int id) {
        Optional<BookNumberEntity> foundBookNumber = bookNumberRepository.findById(id);

        if(foundBookNumber.isPresent()){
            bookNumberRepository.delete(foundBookNumber.get());
        }

        return false;
    }
}
