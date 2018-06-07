package com.emilianocarvalho.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emilianocarvalho.cursomc.domain.Categoria;
import com.emilianocarvalho.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public static void main(String[] args) {
	SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

	Categoria cat1 = new Categoria(1, "Informática");
	Categoria cat2 = new Categoria(2, "Escritório");

	categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	
    }
}
