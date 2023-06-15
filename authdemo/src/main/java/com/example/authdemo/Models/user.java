package com.example.authdemo.Models;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    String id;
    String name;
    String email; // username
    String pass;
    int age;
}
