package com.example.demoMysql.Repository;

import com.example.demoMysql.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cardRepository extends JpaRepository<Card,Integer> {
}
