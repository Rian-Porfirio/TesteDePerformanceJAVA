package br.edu.infnet.rianporfirio.model.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.model.domain.Endereco;
import br.edu.infnet.rianporfirio.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void incluir(Endereco endereco) {		
		enderecoRepository.save(endereco);
	}
	
	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}
	
	public Collection<Endereco> obterLista(){
		return (Collection<Endereco>) enderecoRepository.findAll();
	}
	
	public Endereco obter(Integer id){
		return enderecoRepository.findById(id).orElse(null);
	}
}