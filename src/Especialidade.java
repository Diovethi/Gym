
public class Especialidade {
	private String nome;
	private String duracao;
	
	public Especialidade(String nome, String duracao) {
		setNome(nome);
		setDuracao(duracao);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	

}
