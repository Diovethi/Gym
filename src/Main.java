import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			ArrayList<Especialidade> espLista= new ArrayList<>();
			espLista.add(new Especialidade("Cardio",LocalTime.of(0, 35, 0)));
			espLista.add(new Especialidade("Musculação",LocalTime.of(0, 45, 0)));
			espLista.add(new Especialidade("Velocidade",LocalTime.of(0, 30, 0)));
			espLista.add(new Especialidade("Resistencia",LocalTime.of(1, 15, 0)));
							
			Cliente cliente1= new Cliente("João",LocalDate.of(1978, 05, 13),"Masculino","teste@teste.com", espLista.get(1));
			Instrutor inst1= new Instrutor("Roberta",LocalDate.of(1989, 10, 15),"Femenino","936191001",espLista);
			System.out.println(cliente1.getNome()+" "+cliente1.getContacto());
			System.out.println(inst1.getNome()+" "+inst1.getContacto());
		}catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}
		
	}

}
