package com.example.testexercise.service;

import com.example.testexercise.model.Articles;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ArticlesService {
    List<Articles> findAllArticles();
    Optional<Articles> findArticle(Long id);
    Articles saveArticle(Articles articles);
    Articles updateArticle(Articles articles);
    void deleteArticle(Long id);
}
