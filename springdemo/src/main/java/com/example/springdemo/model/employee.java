package com.example.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class employee {
    String id;
    String name;
    String role;
    double salary;
    double exp;
}
