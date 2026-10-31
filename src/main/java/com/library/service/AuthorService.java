package com.library.service;

import com.library.model.Author;
import com.library.repository.AuthorRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findBuId(id);
    }

    public Map<Long, String> getNameMap() {
        List<Author> authors = authorRepository.findAll();
        Map<Long, String> map = new HashMap<>();

        for (Author a : authors) {
            map.put(a.getId(), a.getName());
        }

        return map;
    }

}
