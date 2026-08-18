package com.capstone.librarymsapprest.repository;

import com.capstone.librarymsapprest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();
    Book findById(long id);

}
