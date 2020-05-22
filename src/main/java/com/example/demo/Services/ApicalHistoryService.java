package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ApicalHistory;
import com.example.demo.Interfaces.IApicalHistory;
import com.example.demo.Respository.ApicalHistoryRepository;

@Service
public class ApicalHistoryService implements IApicalHistory{
	
	@Autowired
	ApicalHistoryRepository repo;
	
	@Override
	public List<ApicalHistory> ListaApicalHistory() {
		return repo.findAll();
	}
}
