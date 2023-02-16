package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @Column(name = "id")
    private Long id;


    @Column(name = "author")
    @OneToOne
    @JoinColumn(name = "name")
    private String author;

    @Column(name = "price")
    private Double price;

    @Column(name = "title")
    private String title;
}
