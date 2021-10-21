import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		try {
			ArrayList<Especialidade> espLista= new ArrayList<Especialidade>();
			espLista.add(new Especialidade("Cardio",LocalTime.parse("00:35:00")));
			espLista.add(new Especialidade("Musculacao",LocalTime.parse("00:40:00")));
			espLista.add(new Especialidade("Velocidade",LocalTime.parse("00:30:00")));
			espLista.add(new Especialidade("Resistencia",LocalTime.parse("01:15:00")));

			Instrutor inst1= new Instrutor("Roberta",LocalDate.parse("1989-10-26"),"Femenino","936191001",espLista);

			ArrayList<Cliente> clienteLista= new ArrayList<Cliente>();
			clienteLista.add(new Cliente("Joao",LocalDate.parse("1978-05-13"),"Masculino","teste@teste.com", espLista.get(1)));
			clienteLista.add(new Cliente("Rodolfo",LocalDate.parse("1998-05-03"),"Masculino","rodolfo@joka.pt", espLista.get(3)));
			clienteLista.add(new Cliente("Roberta",LocalDate.parse("1958-10-23"),"Feminino","Roberta@joka.com", espLista.get(2)));
			clienteLista.add(new Cliente("Joao",LocalDate.parse("1978-05-13"),"Masculino","teste@teste.com", espLista.get(0)));

			Aula aulaMusculacao= new Aula(LocalDate.parse("2021-10-19"),LocalDate.parse("2021-10-19"),LocalTime.parse( "14:30:00"), espLista.get(1), inst1, clienteLista,4 );
			
			System.out.println("Hora de incio da aula: "+aulaMusculacao.getHoraInicio()+" e a hora de fim: "+aulaMusculacao.getHoraFim());
			System.out.println(aulaMusculacao.getListaCliente()+" \n "+aulaMusculacao.getInstrutor().getDataNascimento()+" "+aulaMusculacao.getListaCliente().size());

			
		}catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}
		
	}

}
