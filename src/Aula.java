import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Aula {
	private LocalDate dataInicio, dataFim;
	private LocalTime  horaInicio;
	private Especialidade esp;
	private Instrutor inst;
	private int nMaxCliente;
	private ArrayList<Cliente> listacliente;
	
	public Aula (LocalDate dataInicio,LocalDate dataFim,LocalTime horaInicio,Especialidade esp, Instrutor inst, ArrayList<Cliente> listaclientes,int nMaxCliente) {
	
		if(!isMorethanMaxClients(nMaxCliente , listaclientes)){
			setDataInicio(dataInicio);
			setDataFim(dataFim);
			setEspecialidade(esp);
			setInstrutor(inst);
			setListaCliente(listaclientes);
			setHoraInicio(horaInicio);
			
		}
		else
			throw new IllegalArgumentException("Está a ser inserido demasiados clientes para a capacidade máxima da aula");
	}
	public 	LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public Especialidade getEspecialidade() {
		return esp;
	}
	public void setEspecialidade(Especialidade esp) {
		this.esp = esp;
	}
	public Instrutor getInstrutor() {
		return inst;
	}
	public void setInstrutor(Instrutor inst) {
		this.inst = inst;
	}
	public ArrayList<Cliente> getListaCliente() {
		return listacliente;
	}

	public void setListaCliente(ArrayList<Cliente> listacliente) {
		if(isMorethanMaxClients(this.nMaxCliente,listacliente))
			this.listacliente = listacliente;
		else
			throw new IllegalArgumentException("Está a ser inserido demasiados clientes para a capacidade máxima da aula");
	}
	public void addCliente(Cliente cliente){
		if(!isFull())
			listacliente.add(cliente);
		else
			throw new IllegalArgumentException("A aula já está cheia.");
	}
	
	public int getnMaxCliente() {
		return nMaxCliente;
	}
	public void setnMaxCliente(int nMaxCliente) {
		this.nMaxCliente = nMaxCliente;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	private boolean isMorethanMaxClients(int nMaxCliente, ArrayList<Cliente> listaclientes){
		return (listaclientes.size() > nMaxCliente );

	}

	public boolean isFull(){
		return ( this.nMaxCliente == listacliente.size());
	}
	
}
