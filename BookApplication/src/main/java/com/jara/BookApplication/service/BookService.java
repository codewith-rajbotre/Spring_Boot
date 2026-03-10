package com.jara.BookApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jara.BookApplication.model.Book;
import com.jara.BookApplication.repository.BookRepo;

@Service
public class BookService{
    
    @Autowired
    BookRepo repository;
    public Book addBook(Book book){
         return repository.save(book);
    }

}