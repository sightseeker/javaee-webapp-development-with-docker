package com.sightseekerstudio.bookstore;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kohei.Saito
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
