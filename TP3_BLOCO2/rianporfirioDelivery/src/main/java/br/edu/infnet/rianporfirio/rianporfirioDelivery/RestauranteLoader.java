package br.edu.infnet.rianporfirio.rianporfirioDelivery;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.RestauranteService;

@Component
public class RestauranteLoader implements ApplicationRunner{

	RestauranteService restauranteService = new RestauranteService();
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		restauranteService.incluirEntregador(new Entregador("Pedro"));
		restauranteService.incluirFuncionario(new Funcionario("Maria"));
		
	}
	
}
