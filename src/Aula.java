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
	
	public Aula (LocalDate dataInicio,LocalDate dataFim,LocalTime horaInicio,Especialidade esp, Instrutor inst,int nMaxCliente) {
		setDataInicio(dataInicio);
		setDataFim(dataFim);
		setEspecialidade(esp);
		setInstrutor(inst);
		setHoraInicio(horaInicio);
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
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraFim(){
		return (getHoraInicio().plusNanos(getEspecialidade().getDuracao().toNanoOfDay()));
	}


	public boolean isFull(){
		return ( this.nMaxCliente == listacliente.size());
	}


	
}
