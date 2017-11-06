package com.sightseekerstudio.bookstore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/book")
public class BookResource {

    @GET
    public List<Book> getBooks() {
        return null;
    }

}
