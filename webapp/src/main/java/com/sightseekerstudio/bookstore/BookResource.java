package com.sightseekerstudio.bookstore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import javax.inject.Inject;

@Path("/book")
public class BookResource {

    @Inject
    private BookService service;

    @GET
    public List<Book> getBooks() {
        return service.getBooks();
    }
}
