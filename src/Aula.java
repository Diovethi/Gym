import java.util.ArrayList;

public class Aula {
	private String dataInicio, dataFim, horaInicio;
	private Especialidade esp;
	private Instrutor inst;
	private int nMaxCliente;
	private ArrayList<Cliente> listacliente = new ArrayList<>();
	
	public Aula (String dataInicio,String dataFim,String horaInicio,Especialidade esp, Instrutor inst, ArrayList<Cliente> listacliente) {
		setDataInicio(dataInicio);
		setDataFim(dataFim);
		setEsp(esp);
		setInst(inst);
		setListacliente(listacliente);
		setHoraInicio(horaInicio);
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
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
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
}
