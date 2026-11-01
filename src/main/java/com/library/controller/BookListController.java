package com.library.controller;

import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

public class BookListController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookListController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Book> bookList = bookService.findAll();
        String LibraryName = bookService.getLibraryName();

        List<String> authors = authorService.getNameMap().values().stream().toList();

        ModelAndView modelAndView = new ModelAndView("books");

        modelAndView.addObject("bookList", bookList);
        modelAndView.addObject("LibraryName", LibraryName);
        modelAndView.addObject("authors", authors);

        return modelAndView;

    }
}
