import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		try {
			ArrayList<Especialidade> espLista= new ArrayList<Especialidade>();
			espLista.add(new Especialidade("Cardio","00:35:00"));
			espLista.add(new Especialidade("Muscula��o","00:40:00"));
			espLista.add(new Especialidade("Velocidade","00:30:00"));
			espLista.add(new Especialidade("Resistencia","01:15:00"));

			Instrutor inst1= new Instrutor("Roberta","26-10-1989","Femenino","936191001",espLista);

<<<<<<< HEAD
			ArrayList<Cliente> clienteLista= new ArrayList<Cliente>();
=======

			ArrayList<Cliente> clienteLista= new ArrayList<>();
>>>>>>> e7b6be29af61de2f544c0192d4908d31b3d629fd
			clienteLista.add(new Cliente("Joao","13-05-1978","Masculino","teste@teste.com", espLista.get(1)));
			clienteLista.add(new Cliente("Rodolfo","05-03-1998","Masculino","rodolfo@joka.pt", espLista.get(3)));
			clienteLista.add(new Cliente("Roberta","23-10-1958","Feminino","Roberta@joka.com", espLista.get(2)));
			clienteLista.add(new Cliente("Joao","13-05-1978","Masculino","teste@teste.com", espLista.get(0)));

			Aula aulaMusculacao= new Aula("19-10-2021", "19-10-2021", "14:30:00", espLista.get(1), inst1, clienteLista,4 );
			//aulaMusculacao.addCliente(new Cliente("Joao","13-05-1978","Masculino","teste@teste.com", espLista.get(0)));


			System.out.println(aulaMusculacao.getListaCliente()+" \n "+aulaMusculacao.getInstrutor()+" "+aulaMusculacao.getListaCliente().size());

			
		}catch(IllegalArgumentException ie) {
			System.out.println(ie.getMessage());
		}
		
	}

}
