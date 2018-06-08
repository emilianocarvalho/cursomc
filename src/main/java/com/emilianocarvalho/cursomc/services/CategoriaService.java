package com.emilianocarvalho.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emilianocarvalho.cursomc.domain.Categoria;
import com.emilianocarvalho.cursomc.repositories.CategoriaRepository;
import com.emilianocarvalho.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria busca(Integer id)  {
	Optional<Categoria> obj = repo.findById(id);
	return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
