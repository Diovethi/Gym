import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;


public class Aula {
	private LocalTime horaInicio;
	private Date dataInicio, dataFim;
	private Especialidade esp;
	private Instrutor inst;
	private int nMaxCliente;
	private ArrayList<Cliente> listacliente = new ArrayList<>();
	
	public Aula ( Date dataInicio, Date dataFim, LocalTime horaInicio, Especialidade esp, Instrutor inst, ArrayList<Cliente> listacliente) {
		setDataInicio(dataInicio);
		setDataFim(dataFim);
		setEsp(esp);
		setInst(inst);
		setListacliente(listacliente);
		setHoraInicio(horaInicio);
	}

	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Especialidade getEsp() {
		return esp;
	}
	public void setEsp(Especialidade esp) {
		this.esp = esp;
	}
	public Instrutor getInst() {
		return inst;
	}
	public void setInst(Instrutor inst) {
		this.inst = inst;
	}
	public ArrayList<Cliente> getListacliente() {
		return listacliente;
	}
	public void setListacliente(ArrayList<Cliente> listacliente) {
		this.listacliente = listacliente;
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
	
}
