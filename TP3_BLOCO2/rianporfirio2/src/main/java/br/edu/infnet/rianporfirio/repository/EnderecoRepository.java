package br.edu.infnet.rianporfirio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.rianporfirio.model.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

}