package it.fdellefave.library.service;


import it.fdellefave.library.model.RentalEntity;

import java.util.Optional;


public interface RentalService {

    Iterable<RentalEntity> getAll();

    Optional<RentalEntity> getById(int id);

    RentalEntity create(RentalEntity rental);

    Optional<RentalEntity> update(int id, RentalEntity rental);

    Boolean delete(int id);


}
