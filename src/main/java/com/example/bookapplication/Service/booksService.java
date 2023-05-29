package com.example.bookapplication.Service;


import com.example.bookapplication.Model.Book;
import com.example.bookapplication.Repository.booksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class booksService {
    @Autowired
    booksRepository repository;

    public String add(Book book){

        repository.save(book);  // it will save data

        return "book is added sucessfully..";
    }

    public List<Book> fetchAllBook() {
        return repository.findAll();
    }

    public String UpdateBook(long id, String name) {

        Book book = repository.getById(id);
        book.setName(name);
        repository.save(book);    // save again

        return "data updated and saved successfully....";
    }
    public String deleteBook (@PathVariable long id){
        repository.deleteById(id);
        return  "book is deleted successfully...";
    }

    public List<Book> fetchBookBySubject(@PathVariable String subject){
        return repository.findBySubject(subject);
    }
    public List<Book> fetchBookByNameAndSubject(@PathVariable String name, @PathVariable String subject) {
        return repository.findByNameAndSubject(name, subject);
    }
    }
