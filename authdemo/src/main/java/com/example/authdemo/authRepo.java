package com.example.authdemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.authdemo.Models.user;

public interface authRepo extends MongoRepository<user, String> {
    
}
