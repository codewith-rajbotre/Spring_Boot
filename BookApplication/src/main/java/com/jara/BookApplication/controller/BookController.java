package com.jara.BookApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jara.BookApplication.model.Book;
import com.jara.BookApplication.service.BookService;

@RestController
@RequestMapping("/api")
class BookController{
    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book){
          Book newBook = service.addBook(book);
          return ResponseEntity.ok(newBook);
     }

}