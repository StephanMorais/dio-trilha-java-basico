package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa>tarefaLista;

	public ListaTarefa() {
		this.tarefaLista= new ArrayList<>();
	}
	

	public void adicionarTarefa(String descricao) {
		
		tarefaLista.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa>tarefasParaRemover=new ArrayList<>();
		for (Tarefa t:tarefaLista) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
				}
		}
		tarefaLista.removeAll(tarefasParaRemover);
	}
	
	public int obterNUmeroTotalTarefas() {
		return tarefaLista.size();
	}

	public void obterDescricoesTarefas() {
	System.out.println(tarefaLista);}
}
