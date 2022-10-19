package com.example.testexercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "articles")
@Table(name = "articles")
@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "products_id")
    @JsonBackReference
    private Products products;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @Column(name = "creation_date")
    private String creation_date;
}
