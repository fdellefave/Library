package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.RentalEntity;
import it.fdellefave.library.repository.BookRepository;
import it.fdellefave.library.repository.RentalRepository;
import it.fdellefave.library.repository.UserRepository;
import it.fdellefave.library.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class RentalServiceImplement implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Iterable<RentalEntity> getAll() {
        return rentalRepository.findAll();
    }

    @Override
    public Optional<RentalEntity> getById(int id) {
        return rentalRepository.findById(id);
    }



    @Override
    public RentalEntity create(RentalEntity rental) {

        RentalEntity rentalCreate = new RentalEntity(
                rental.getRentalDate(),
                userRepository.findById(rental.getUserRentalEntity().getIdUser())
                        .orElseThrow(()->new EntityNotFoundException("User non trovato")),
                bookRepository.findById(rental.getBookRentalEntity().getIdBook())
                        .orElseThrow(()->new EntityNotFoundException("Libro non trovato"))
        );


        return rentalRepository.save(rentalCreate);
    }


    @Override
    public Optional<RentalEntity> update(int id, RentalEntity rental) {

        Optional<RentalEntity> foundRental = rentalRepository.findById(id);

        if(!(foundRental.isPresent())){
            return Optional.empty();
        }

        foundRental.get().setBookRentalEntity(bookRepository.findById(rental.getBookRentalEntity().getIdBook())
                .orElseThrow(()->new EntityNotFoundException("Libro non trovato")));
        foundRental.get().setUserRentalEntity( userRepository.findById(rental.getUserRentalEntity().getIdUser())
                .orElseThrow(()->new EntityNotFoundException("User non trovato")));
        foundRental.get().setRentalDate(rental.getRentalDate());

        rentalRepository.save(foundRental.get());

        return foundRental;
    }

    @Override
    public Boolean delete(int id) {

        Optional<RentalEntity> foundRental = rentalRepository.findById(id);

        if(foundRental.isPresent()){
            rentalRepository.delete(foundRental.get());
        }

        return false;
    }
}
