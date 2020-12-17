package com.example.accessingdatamysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.accessingdatamysql.User;
import org.springframework.data.jpa.repository.Query;
import java.util.*;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    @Query("select u from User u where u.name = ?1")
    List<User> findByName(String name);
}
