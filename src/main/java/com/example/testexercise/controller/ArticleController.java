package com.example.testexercise.controller;

import com.example.testexercise.model.Articles;
import com.example.testexercise.service.ArticlesService;
import com.example.testexercise.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Qualifier("articlesServiceImpl")
    @Autowired
    ArticlesService service;


    @GetMapping("")
    public List<Articles> findAllArticles() {
        return service.findAllArticles();
    }
    @GetMapping("/{id}")
    public Optional<Articles> findByID(@PathVariable("id") Long id) {
        return service.findArticle(id);
    }

    @PostMapping
    public Articles saveArticles(@RequestBody Articles articles){
        return service.saveArticle(articles);
    }

    @PutMapping
    public Articles updateArticles(@RequestBody Articles articles){
        return service.updateArticle(articles);
    }

    @DeleteMapping("/{id}")
    public void deleteArticles(@PathVariable("id") Long id){
        service.deleteArticle(id);
    }
}
