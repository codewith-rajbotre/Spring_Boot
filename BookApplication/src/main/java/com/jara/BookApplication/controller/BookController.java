package com.jara.BookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

     @GetMapping("/showBooks")
     public List<Book> getBooks(){
         return service.getBooks();
     }

    @GetMapping("/getBookById/{book_id}")
    public Book getBookById(@PathVariable int book_id){
             return service.getBookById(book_id);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book){
        return service.updateBook(id, book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBookById(@PathVariable int id){
           service.deleteBookById(id);
    }

}