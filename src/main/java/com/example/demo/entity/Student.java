package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

   @Id
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "gpa")
   private Double gpa;

}
