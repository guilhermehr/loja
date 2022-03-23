package br.com.alura.microservice.loja.model;

import lombok.Data;

@Data
public class Compra {

	private long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;
}
