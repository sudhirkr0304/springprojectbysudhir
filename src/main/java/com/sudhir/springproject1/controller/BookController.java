package com.sudhir.springproject1.controller;

import com.sudhir.springproject1.entity.Book;
import com.sudhir.springproject1.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
@RequestMapping(value = "/books" , produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String helloBooks() {
        return "books";
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }
}
