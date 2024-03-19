package br.edu.infnet.rianporfirio.model.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.model.domain.Escola;
import br.edu.infnet.rianporfirio.repository.EscolaRepository;

@Service
public class EscolaService {

	@Autowired
	private EscolaRepository escolaRepository;
	
	public void incluir(Escola escola) {
		escolaRepository.save(escola);
	}
	
	public void excluir(String nome) {
		//escolas.remove(nome);
	}
	
	public Collection<Escola> obterLista(){
		return null;//escolas.values();
	}
	
	public Escola obter(String nome){
		return null;//escolas.get(nome);
	}
}