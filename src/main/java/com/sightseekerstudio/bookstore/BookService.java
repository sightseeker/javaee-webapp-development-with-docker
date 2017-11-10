package com.sightseekerstudio.bookstore;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Kohei.Saito
 */
@ApplicationScoped
public class BookService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void register(Book book) {
        em.persist(book);
    }

    public List<Book> getBooks() {
        return em.createQuery("SELECT e FROM Book e", Book.class).getResultList();
    }
}
