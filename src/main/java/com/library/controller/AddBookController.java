package com.library.controller;

import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AddBookController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;

    public AddBookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String method = request.getMethod();

        if ("POST".equalsIgnoreCase(method)){
            String title = request.getParameter("title");
            int pages = Integer.parseInt(request.getParameter("pages"));
            Long authorId = Long.valueOf(request.getParameter("authorId"));
            Book book = new Book((long) (bookService.findAll().size()+1),title,authorId,pages);
            bookService.addBook(book);
            response.sendRedirect(request.getContextPath() + "/books");
            return null;
        }else {
            ModelAndView modelAndView = new ModelAndView("add-book");
            modelAndView.addObject("authors",authorService.findAll());
            return modelAndView;
        }
    }
}
