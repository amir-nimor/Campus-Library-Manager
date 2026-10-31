package com.library.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Book {

    private Long id;

    private String title;

    private Long authorId;

    private int pages;


}
