package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Post;
import com.example.demo.Respository.PostRepository;
import com.example.demo.Interfaces.IPost;


@Service
public class PostService implements IPost {
	
	@Autowired
	 PostRepository repo;
	
	@Override
	public List<Post> listaPost() {
		return repo.findAll();
	}
}
