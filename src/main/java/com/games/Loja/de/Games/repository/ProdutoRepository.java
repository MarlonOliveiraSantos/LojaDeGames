package com.games.Loja.de.Games.repository;

import com.games.Loja.de.Games.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
