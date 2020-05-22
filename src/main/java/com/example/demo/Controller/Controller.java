package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ApicalHistory;
import com.example.demo.Entity.Comments;
import com.example.demo.Entity.Post;
import com.example.demo.Services.ApicalHistoryService;
import com.example.demo.Services.CommentsService;
import com.example.demo.Services.PostService;

@RestController
@RequestMapping("/Api")
public class Controller {

	@Autowired
	private PostService postService;
	private CommentsService commentsService;
	private ApicalHistoryService apicalHisttoryService;
	
	@GetMapping("/Post")
	public List<Post> listaPost() {
		return postService.listaPost();
	}
	
	@GetMapping("/Comments")
	public List<Comments> listaComments() {
		return commentsService.listaComments();
	}
	
	@GetMapping("/ApicalHistory")
	public List<ApicalHistory> ListaApicalHistory() {
		return apicalHisttoryService.ListaApicalHistory(); 
	}
}
