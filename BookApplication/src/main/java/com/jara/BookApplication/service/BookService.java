package com.jara.BookApplication.service;

import java.util.List;

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

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Book getBookById(int id){
        return repository.findById(id).orElse(null);
    }

   public Book updateBook(int id, Book book){
         Book existingBook = repository.findById(id).orElse(null);
         existingBook.setName(book.getName());
         existingBook.setAuthor(book.getAuthor());
         existingBook.setPublishedYear(book.getPublishedYear());
         return repository.save(existingBook);
   }

   public void deleteBookById(int id){
          repository.deleteById(id);
   }

}