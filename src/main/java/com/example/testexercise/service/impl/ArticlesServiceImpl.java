package com.example.testexercise.service.impl;

import com.example.testexercise.model.Articles;
import com.example.testexercise.repotsitory.ArticlesRepo;
import com.example.testexercise.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticlesServiceImpl implements ArticlesService {
    @Autowired
    ArticlesRepo repo;

    @Override
    public List<Articles> findAllArticles() {
        return repo.findAll();
    }

    @Override
    public Optional<Articles> findArticle(Long id) {
        return repo.findById(id);
    }

    @Override
    public Articles saveArticle(Articles articles) {
        return repo.save(articles);
    }

    @Override
    public Articles updateArticle(Articles articles) {
        return repo.save(articles);
    }

    @Override
    public void deleteArticle(Long id) {
        repo.deleteById(id);
    }
}
