package com.example.demoMysql.Converters;

import com.example.demoMysql.Dto.studentRequestDto;
import com.example.demoMysql.Model.Student;

public class studentConverter {
    public Student studentDtoConverToStudent(studentRequestDto studentRequestDto){
        Student student= Student.builder().name(studentRequestDto.getName()).
                rollno(studentRequestDto.getRollno()).build();
        return student;
    }
}
