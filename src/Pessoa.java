import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private String genero;
	private String contacto;
	
	public Pessoa(String nome, LocalDate dataNascimento, String genero,String contacto) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setGenero(genero);
		setContacto(contacto);
	}
	public Pessoa(String nome, LocalDate dataNascimento2, String genero) {
		setNome(nome);
		setDataNascimento(dataNascimento2);
		setGenero(genero);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto)  throws IllegalArgumentException {
		if(valiLocalDate(contacto))
			this.contacto = contacto;
		else
			throw new IllegalArgumentException("Email do "+getNome()+" está incorrecto!");
	}
	private boolean valiLocalDate(String contacto) {
		if(contacto.contains("@") && contacto.substring((contacto.length()-4)).contains(".com")|| contacto.substring((contacto.length()-4)).contains(".pt"))
			return true;
		else
			return false;
	}
}
