package br.com.project.calc.visao.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	public void valorAlterado(String novoValor);
}
