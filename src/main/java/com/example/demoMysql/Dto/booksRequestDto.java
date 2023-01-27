package com.example.demoMysql.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class booksRequestDto {
    private String name;
    private int pages;
}
