
public class Cliente extends Pessoa {
	
	private Especialidade especialidadeFavorita;
	
	public Cliente(String nome,String dataNascimento, String genero, String email,Especialidade espfavorita) {
		super(nome, dataNascimento, genero,email);
		setEspecialidadeFavorita(espfavorita);
	}

	public Especialidade getEspecialidadeFavorita() {
		return especialidadeFavorita;
	}

	public void setEspecialidadeFavorita(Especialidade especialidadeFavorita) {
		this.especialidadeFavorita = especialidadeFavorita;
	}
	
}
