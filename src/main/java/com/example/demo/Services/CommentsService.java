package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Comments;
import com.example.demo.Interfaces.IComments;
import com.example.demo.Respository.CommentsRepository;

@Service
public class CommentsService implements IComments {
	@Autowired
	  CommentsRepository repo;
	
	@Override
	public List<Comments> listaComments() {
		return repo.findAll();
	}
	
	

}
