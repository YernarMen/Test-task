package com.example.testexercise.repotsitory;

import com.example.testexercise.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepo extends JpaRepository<Articles, Long> {
}
