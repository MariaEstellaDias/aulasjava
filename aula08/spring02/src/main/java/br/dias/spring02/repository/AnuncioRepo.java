package br.dias.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.dias.spring02.model.Anuncio;

public interface AnuncioRepo extends CrudRepository<Anuncio, Integer>{

}
