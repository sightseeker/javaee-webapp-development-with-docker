package com.sightseekerstudio.bookstore;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.enterprise.inject.Model;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Kohei.Saito
 */
@Model
public class BookRegisterViewModel {

    @Inject
    private BookService service;

    @Getter
    @Setter
    private Book book;

    @PostConstruct
    private void setupViewModel() {
        book = new Book();
    }

    public String registerButtonPressed() {
        service.register(book);
        return null;
    }

}
