import java.time.LocalDate;
import java.util.ArrayList;

public class Instrutor extends Pessoa {
	
	private String nTelemovel;
	private ArrayList<Especialidade> listaEspecialidade = new ArrayList<>();
	
	public Instrutor(String nome,LocalDate dataNascimento, String genero,String ntelemovel,ArrayList<Especialidade> listaEspecialidade) {
		super(nome,dataNascimento,genero);
		setContacto(ntelemovel);
		if(listaEspecialidade.size()>=4)
			setListaEspecialidade(listaEspecialidade);
			
	}

	@Override
	public String getContacto() {
		return nTelemovel;
	}

	@Override
	public void setContacto(String ntelemovel) {
		this.nTelemovel = ntelemovel;

	}

	
	public void setListaEspecialidade(ArrayList<Especialidade> listaEsp) {
		this.listaEspecialidade=listaEsp;
	}
	
	public void addListaEspecialidade(ArrayList<Especialidade> listaEspecialidade) {
		listaEspecialidade.addAll(listaEspecialidade);
	}
	
	public ArrayList<Especialidade> getListaEspecialidade(){
		return listaEspecialidade;
	}
	
}
