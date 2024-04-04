package br.edu.infnet.licitacaoApp.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import spark.Route;

public class ViacepController {
	public static Route obterEndereco = (request, response)->{
		String cep = request.params("cep");
		
		String url = "https://viacep.com.br/ws/" + cep + "/json/";
		
		@SuppressWarnings("deprecation")
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		if(responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder responseBuilder = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null) {
				responseBuilder.append(line);
			}
			reader.close();
			
			return responseBuilder.toString();
			
		} else {
			return "Erro ao obter o endereco para o CEP: " + cep;
		}
	};
}
