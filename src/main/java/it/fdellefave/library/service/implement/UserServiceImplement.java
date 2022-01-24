package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.User;
import it.fdellefave.library.repository.UserRepository;
import it.fdellefave.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Iterable<User> getAll() {
        return null;
    }

    @Override
    public Optional<User> getById(int id) {
        return Optional.empty();
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<User> update(int id, User user) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
