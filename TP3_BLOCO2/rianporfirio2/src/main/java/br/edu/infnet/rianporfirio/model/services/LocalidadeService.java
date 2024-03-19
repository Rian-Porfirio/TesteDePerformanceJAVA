package br.edu.infnet.rianporfirio.model.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.clients.IEnderecoClient;
import br.edu.infnet.rianporfirio.clients.ILocalidadeClient;
import br.edu.infnet.rianporfirio.model.domain.Distrito;
import br.edu.infnet.rianporfirio.model.domain.Endereco;
import br.edu.infnet.rianporfirio.model.domain.Estado;
import br.edu.infnet.rianporfirio.model.domain.Municipio;

@Service
public class LocalidadeService {
	
	@Autowired
	private ILocalidadeClient localidadeClient;
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
	
	public Collection<Estado> obterEstados(){
		return localidadeClient.obterEstados();
	}

	public Collection<Municipio> obterMunicipioPorUF(Integer uf){
		return localidadeClient.obterMunicipioPorUF(uf);
	}
	
	public Collection<Distrito> obterDistritoPorMunicipio(Integer municipio){
		return localidadeClient.obterDistritoPorMunicipio(municipio);
	}
}
