package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BOOKS")
@AttributeOverride(name = "id", column = @Column(name = "book_id"))
public class Book {

    @Id
    @Column(name = "ID",insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "BOOK_TITLE")
    @Size(min = 2, max = 30)
    private String title;
    @Column(name = "BOOK_ISBN")
    private String isbn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
