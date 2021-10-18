package br.admjr.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.admjr.com.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
