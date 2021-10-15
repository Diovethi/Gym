import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			ArrayList<Especialidade> espLista= new ArrayList<>();
			espLista.add(new Especialidade("Cardio","00:35:00"));
			espLista.add(new Especialidade("Musculação","00:40:00"));
			espLista.add(new Especialidade("Velocidade","00:30:00"));
			espLista.add(new Especialidade("Resistencia","01:15:00"));
			
			Cliente cliente1= new Cliente("João","13-05-1978","Masculino","teste@teste.com", espLista.get(1));
			Instrutor inst1= new Instrutor("Roberta","26-10-1989","Femenino","936191001",espLista);
			System.out.println(cliente1.getNome()+" "+cliente1.getContacto());
			System.out.println(inst1.getNome()+" "+inst1.getContacto());
		}catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}
		
	}

}
