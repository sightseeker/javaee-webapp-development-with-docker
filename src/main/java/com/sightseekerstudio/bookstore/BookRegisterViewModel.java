package com.sightseekerstudio.bookstore;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Kohei.Saito
 */
@Model
public class BookRegisterViewModel {

    private FacesContext context = FacesContext.getCurrentInstance();

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
        context.addMessage("book_register:submit", new FacesMessage("Registered : " + book.getName()));
        book = new Book();
        return null;
    }

}
