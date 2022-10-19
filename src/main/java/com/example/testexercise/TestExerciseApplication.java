package com.example.testexercise;

import com.example.testexercise.model.Articles;
import com.example.testexercise.model.Products;
import com.example.testexercise.repotsitory.ArticlesRepo;
import com.example.testexercise.repotsitory.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TestExerciseApplication{
    public static void main(String[] args) {
        SpringApplication.run(TestExerciseApplication.class, args) ;
    }
}
