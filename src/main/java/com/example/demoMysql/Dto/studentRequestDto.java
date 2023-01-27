package com.example.demoMysql.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class studentRequestDto {
    private String name;
    private int rollno;

}
