package com.moraes.livros.repository;

import com.moraes.livros.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {


}
