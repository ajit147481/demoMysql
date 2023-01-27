package com.example.demoMysql.Repository;

import com.example.demoMysql.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface booksRepository extends JpaRepository<Books,Integer> {
}
