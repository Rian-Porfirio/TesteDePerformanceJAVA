package br.edu.infnet.rianporfirio.rianporfirioDelivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Endereco;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.LocalidadeService;

@Component
public class EnderecoLoader implements ApplicationRunner {
	@Autowired
	private LocalidadeService localidadeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco = localidadeService.obterPorCep("95010060");
		
		System.out.println("Endereco adicionado com sucesso");
		System.out.println(endereco);
		
		Endereco endereco2 = localidadeService.obterPorCep("36570083");
		
		System.out.println("Endereco adicionado com sucesso");
		System.out.println(endereco2);
		
//		Cadastro com API
		Endereco endereco3 = localidadeService.obterPorCep("15390000");
		System.out.println("Endereco adicionado com sucesso");
		System.out.println(endereco3);
	}
}