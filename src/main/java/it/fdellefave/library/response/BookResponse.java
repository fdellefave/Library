package it.fdellefave.library.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@NoArgsConstructor
@Component
public class BookResponse {

    private int idBook;

    private String title;

    private Double price;

    private String description;

    private int quantity;


}
