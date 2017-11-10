package com.sightseekerstudio.bookstore;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import lombok.Getter;

/**
 *
 * @author Kohei.Saito
 */
@Model
public class BookViewerViewModel {

    @Getter
    private List<Book> books;

    @Inject
    private BookService service;

    @PostConstruct
    public void getAllBooks() {
        books = service.getBooks();
    }

}
