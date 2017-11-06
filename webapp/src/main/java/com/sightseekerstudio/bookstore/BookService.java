package com.sightseekerstudio.bookstore;

import java.util.List;
import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kohei.Saito
 */
@ApplicationScoped
public class BookService {

    @PersistenceContext
    private EntityManager em;

    @TransactionAttribute
    public void register(Book book) {
        em.persist(book);
    }

    public List<Book> getBooks() {
        return em.createQuery("SELECT e FROM Book e", Book.class).getResultList();
    }
}
