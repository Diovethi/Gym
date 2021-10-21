import java.time.LocalTime;

public class Especialidade {
	private String nome;
	private LocalTime duracao;
	
	public Especialidade(String nome, LocalTime duracao) {
		setNome(nome);
		setDuracao(duracao);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalTime getDuracao() {
		return duracao;
	}
	public void setDuracao(LocalTime duracao) {
		this.duracao = duracao;
	}
	

}
