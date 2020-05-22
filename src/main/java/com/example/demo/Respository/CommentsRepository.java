package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

}
