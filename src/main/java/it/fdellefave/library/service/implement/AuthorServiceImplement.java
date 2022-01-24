package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.repository.AuthorRepository;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImplement implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public Iterable<AuthorEntity> getAll() {

        return authorRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> getById(int id) {

        return authorRepository.findById(id);
    }

    @Override
    public AuthorEntity create(AuthorEntity author) {

        AuthorEntity authorCreate = new AuthorEntity(
                author.getName(),
                author.getSurname(),
                author.getDateBirth(),
                author.getLocalBirth()
        );

        return authorRepository.save(authorCreate);
    }

    @Override
    public Optional<AuthorEntity> update(int id, AuthorEntity authorEntity) {

        Optional<AuthorEntity> foundAuthor = authorRepository.findById(id);

        if (!(foundAuthor.isPresent())) {
            return Optional.empty();
        }

        foundAuthor.get().setName(authorEntity.getName());
        foundAuthor.get().setSurname(authorEntity.getSurname());
        foundAuthor.get().setDateBirth(authorEntity.getDateBirth());
        foundAuthor.get().setLocalBirth(authorEntity.getLocalBirth());

        authorRepository.save(foundAuthor.get());

        return foundAuthor;
    }

    @Override
    public Boolean delete(int id) {

        Optional<AuthorEntity> foundAuthor = authorRepository.findById(id);

        if (foundAuthor.isPresent()) {
            authorRepository.delete(foundAuthor.get());
        }

        return false;
    }

}
