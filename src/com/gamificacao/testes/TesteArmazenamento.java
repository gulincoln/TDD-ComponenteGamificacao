package com.gamificacao.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gamificacao.componentes.Armazenamento;

public class TesteArmazenamento {

	
	@Test
	public void TesteArquivoExiste() {
		Armazenamento armazenamento = new Armazenamento();
		String result = armazenamento.abrirArquivo("nomeArquivo.txt");
		assertEquals("arquivo aberto!",result);
	}

}
