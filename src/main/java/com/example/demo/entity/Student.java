package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@Builder
@ToString
public class Student {

   @Id
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "gpa")
   private Double gpa;


   @OneToOne(optional = false)
   @JoinColumn(name = "name", updatable = false, insertable = false, referencedColumnName = "author")
   private Book book;


}
