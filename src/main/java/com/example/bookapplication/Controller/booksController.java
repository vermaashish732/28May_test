package com.example.bookapplication.Controller;

import com.example.bookapplication.Model.Book;
import com.example.bookapplication.Service.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class booksController {

    ArrayList<Book> books = new ArrayList<>();

    @Autowired
    booksService service;
    @PostMapping("/BooksAdd")
    public String BooksAdd(@RequestBody Book book){

        service.add(book);  // it will save data

        return "Book is added sucessfully..";
    }


    // R- read data from the database

    @GetMapping("/fetchAllBook")
    public List<Book> fetchAllBook(){

        return service.fetchAllBook();
    }


    @PutMapping("/UpdateBook/{id}/{name}")
    public String  UpdateBook(@PathVariable long id,  @PathVariable String name){

        return service.UpdateBook(id , name);

    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook (@PathVariable long id){
        return  service.deleteBook(id);
    }

    @GetMapping("/fetchBookBySubject/{subject}")
    public List<Book> fetchBookBySubject(@PathVariable String subject){

        return service.fetchBookBySubject(subject);
    }


    @GetMapping("/fetchBookByNameAndSubject/{name}/{subject}")
    public List<Book> fetchBookByNameAndSubject(@PathVariable String name, @PathVariable String subject){

        return service.fetchBookByNameAndSubject(name, subject);
    }

    }

