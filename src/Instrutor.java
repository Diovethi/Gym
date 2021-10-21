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
			if(validate(ntelemovel))
				this.nTelemovel = ntelemovel;
			else
				throw new IllegalArgumentException("O número de "+getNome()+" não está correto!");
	}

	private boolean validate(String ntelemovel) {
		try{
			Integer.parseInt(ntelemovel);
		}catch(NumberFormatException e){
			throw new IllegalArgumentException("O número de "+getNome()+" está inválido!");
		}
		return ntelemovel.substring(0).contains("9") && ntelemovel.length()==9 ;
	}

	public void setListaEspecialidade(ArrayList<Especialidade> listaEsp) {
		this.listaEspecialidade=listaEsp;
	}
	
	public ArrayList<Especialidade> getListaEspecialidade(){
		return listaEspecialidade;
	}
	
}
