package it.fdellefave.library.api;

import it.fdellefave.library.model.BookEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@NoArgsConstructor
@Component
public class BookNumberApi {

    private int idBookNumber;

    private String isbnCode;

    public BookNumberApi(int idBookNumber, String isbnCode) {
        this.idBookNumber = idBookNumber;
        this.isbnCode = isbnCode;
    }
}
