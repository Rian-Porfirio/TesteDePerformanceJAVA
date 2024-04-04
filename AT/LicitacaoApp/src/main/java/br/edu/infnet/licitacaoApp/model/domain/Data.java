package br.edu.infnet.licitacaoApp.model.domain;

public class Data {
	private String data;
	private String horas;
	
	@Override
	public String toString() {
		return "data " + getData() + " horas " + getHoras();
	}
	
	public Data(String data, String horas) {
		this.data = data;
		this.horas = horas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}
}
