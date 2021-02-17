package com.carlos.curso.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.curso.boot.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


 }
