package com.example.demoMysql.Converters;

import com.example.demoMysql.Dto.booksRequestDto;
import com.example.demoMysql.Model.Books;

public class booksConverter {
    public Books booksRequestDtoToBooks(booksRequestDto booksRequestDto){
        Books books= Books.builder().name(booksRequestDto.getName())
                .pages(booksRequestDto.getPages()).build();
        return books;
    }
}
