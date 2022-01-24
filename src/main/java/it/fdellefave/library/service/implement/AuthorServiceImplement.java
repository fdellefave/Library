package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.Author;
import it.fdellefave.library.repository.AuthorRepository;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImplement implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public Iterable<Author> getAll() {

        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> getById(int id) {

        return authorRepository.findById(id);
    }

    @Override
    public Author create(Author author) {

        Author authorCreate = new Author(
                author.getName(),
                author.getSurname(),
                author.getDateBirth(),
                author.getLocalBirth()
        );

        return authorRepository.save(authorCreate);
    }

    @Override
    public Optional<Author> update(int id, Author author) {

        Optional<Author> foundAuthor = authorRepository.findById(id);

        if (!(foundAuthor.isPresent())) {
            return Optional.empty();
        }

        foundAuthor.get().setName(author.getName());
        foundAuthor.get().setSurname(author.getSurname());
        foundAuthor.get().setDateBirth(author.getDateBirth());
        foundAuthor.get().setLocalBirth(author.getLocalBirth());

        authorRepository.save(foundAuthor.get());

        return foundAuthor;
    }

    @Override
    public Boolean delete(int id) {

        Optional<Author> foundAuthor = authorRepository.findById(id);

        if (foundAuthor.isPresent()) {
            authorRepository.delete(foundAuthor.get());
        }

        return false;
    }

}
