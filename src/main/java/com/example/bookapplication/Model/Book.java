package com.example.bookapplication.Model;

import javax.persistence.*;


@Entity
@Table (name = "Books")
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "Book_Name")
    private String name;
    @Column(name = "Page_No")
    private int pages;
    @Column(name = "Subject_Name")
    private String subject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Book(String name, int pages, String subject) {
        this.id = id;
        this.name = name;
        this.pages = pages;
            this.subject = subject;
    }

    public Book() {
    }
}
