package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.UserEntity;
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
    public Iterable<UserEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UserEntity> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public UserEntity create(UserEntity userEntity) {

        UserEntity userEntityCreate = new UserEntity(
                userEntity.getName(),
                userEntity.getSurname()
        );

        return repository.save(userEntityCreate);
    }

    @Override
    public Optional<UserEntity> update(int id, UserEntity userEntity) {

        Optional<UserEntity> userFound = repository.findById(id);

        if(!userFound.isPresent()){
            return Optional.empty();
        }

        userFound.get().setName(userEntity.getName());
        userFound.get().setSurname(userEntity.getSurname());

        repository.save(userFound.get());

        return userFound;
    }

    @Override
    public Boolean delete(int id) {
        Optional<UserEntity> userFound = repository.findById(id);

        if(userFound.isPresent()){
            repository.delete(userFound.get());
        }

        return false;
    }
}
