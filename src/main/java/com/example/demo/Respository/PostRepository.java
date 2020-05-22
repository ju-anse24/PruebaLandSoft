package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
