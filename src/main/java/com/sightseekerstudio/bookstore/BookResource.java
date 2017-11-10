package com.sightseekerstudio.bookstore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class BookResource {

    @Inject
    private BookService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return service.getBooks();
    }
}
