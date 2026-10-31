package com.library.repository;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private static final List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book(1L,"java",1L,250));
        bookList.add(new Book(2L,"python",2L,120));
        bookList.add(new Book(3L,"Golang",1L,152));
    }

    public List<Book> findAll(){
        return bookList;
    }


    public Book findById(Long id){
        return (Book) bookList.stream().filter(b -> b.getId() == id);
    }

    public void addBook(Book book){
        bookList.add(book);
    }
}
