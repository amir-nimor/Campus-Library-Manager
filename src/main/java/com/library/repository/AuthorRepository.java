package com.library.repository;

import com.library.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    private static final List<Author> authorList = new ArrayList<>();

    static {
        authorList.add(new Author(1L,"amir"));
        authorList.add(new Author(2L,"ali"));
        authorList.add(new Author(3L,"reza"));
    }

    public List<Author> findAll(){
        return authorList;
    }

    public Author findBuId(Long id){
        return (Author) authorList.stream().filter(a -> a.getId() == id);
    }
}
