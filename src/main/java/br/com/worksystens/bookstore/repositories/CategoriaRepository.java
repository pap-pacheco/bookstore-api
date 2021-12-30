package br.com.worksystens.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.worksystens.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
//Utilizado no lugar das classes .DAO
//Não sendo necessário a utilização de várias consultas sql
//Os parametros passados são a Classe utilizada e o Tipo da chave primária
	
}
