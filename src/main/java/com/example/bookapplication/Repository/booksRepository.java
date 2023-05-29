package com.example.bookapplication.Repository;

import com.example.bookapplication.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface booksRepository extends JpaRepository <Book, Long> {

    public List<Book> findBySubject(String subject);
    public List<Book> findByNameAndSubject(String name, String subject);

}
