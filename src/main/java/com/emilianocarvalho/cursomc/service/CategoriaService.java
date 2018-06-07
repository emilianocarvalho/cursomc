package com.emilianocarvalho.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emilianocarvalho.cursomc.domain.Categoria;
import com.emilianocarvalho.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;
    
    public Categoria busca(Integer id) {
	Optional<Categoria> obj = repo.findById(id); 
	return obj.orElse(null);
    }
}
