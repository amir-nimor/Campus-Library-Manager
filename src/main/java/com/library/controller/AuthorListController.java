package com.library.controller;

import com.library.service.AuthorService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AuthorListController implements Controller {

    private final AuthorService authorService;

    public AuthorListController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
       ModelAndView modelAndView = new ModelAndView("authors");

       modelAndView.addObject("authors",authorService.findAll());

       return modelAndView;
    }
}
