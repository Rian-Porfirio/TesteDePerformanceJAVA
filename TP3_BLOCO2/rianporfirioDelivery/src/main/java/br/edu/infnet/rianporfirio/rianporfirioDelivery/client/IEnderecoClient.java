package br.edu.infnet.rianporfirio.rianporfirioDelivery.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "EnderecoClient")
public interface IEnderecoClient {

	@GetMapping(value = "/{cep}/json")
	Endereco obterEnderecoPorCep(@PathVariable String cep);
}
