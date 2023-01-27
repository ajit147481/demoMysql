package com.example.demoMysql.Repository;

import com.example.demoMysql.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Integer> {
}
