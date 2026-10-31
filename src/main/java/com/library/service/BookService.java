package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookService {

    private final BookRepository bookRepository;

    private String libraryName;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }


    public Book findById(Long id){
        return bookRepository.findById(id);
    }

    public void addBook(Book book){
        bookRepository.addBook(book);
    }


    public String getLibraryName(){
        return this.libraryName;
    }
}
