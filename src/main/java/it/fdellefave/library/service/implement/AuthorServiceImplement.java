package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.repository.AuthorCategoryRepository;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImplement implements AuthorService {

    @Autowired
    private AuthorCategoryRepository authorCategoryRepository;


    public Iterable<AuthorEntity> getAll() {

        return authorCategoryRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> getById(int id) {

        return authorCategoryRepository.findById(id);
    }

    @Override
    public AuthorEntity create(AuthorEntity author) {

        AuthorEntity authorCreate = new AuthorEntity(
                author.getName(),
                author.getSurname(),
                author.getDateBirth(),
                author.getLocalBirth()
        );

        return authorCategoryRepository.save(authorCreate);
    }

    @Override
    public Optional<AuthorEntity> update(int id, AuthorEntity authorEntity) {

        Optional<AuthorEntity> foundAuthor = authorCategoryRepository.findById(id);

        if (!(foundAuthor.isPresent())) {
            return Optional.empty();
        }

        foundAuthor.get().setName(authorEntity.getName());
        foundAuthor.get().setSurname(authorEntity.getSurname());
        foundAuthor.get().setDateBirth(authorEntity.getDateBirth());
        foundAuthor.get().setLocalBirth(authorEntity.getLocalBirth());

        authorCategoryRepository.save(foundAuthor.get());

        return foundAuthor;
    }

    @Override
    public Boolean delete(int id) {

        Optional<AuthorEntity> foundAuthor = authorCategoryRepository.findById(id);

        if (foundAuthor.isPresent()) {
            authorCategoryRepository.delete(foundAuthor.get());
        }

        return false;
    }

}
