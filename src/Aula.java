import java.util.ArrayList;

public class Aula {
	private String dataInicio, dataFim, horaInicio;
	private Especialidade esp;
	private Instrutor inst;
<<<<<<< HEAD
	private int nMaxCliente;
	private ArrayList<Cliente> listacliente;
	
	public Aula (String dataInicio,String dataFim,String horaInicio,Especialidade esp, Instrutor inst, ArrayList<Cliente> listaclientes,int nMaxCliente) {
	
		if(!isMorethanMaxClients(nMaxCliente , listaclientes)){
=======
	private Integer nMaxCliente;
	private ArrayList<Cliente> listacliente = new ArrayList<>();

	public Aula (String dataInicio,String dataFim,String horaInicio,Especialidade esp, Instrutor inst, ArrayList<Cliente> listacliente,Integer nMaxCliente) {
		if(isMaxCliente(nMaxCliente,listacliente)){
>>>>>>> e7b6be29af61de2f544c0192d4908d31b3d629fd
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
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

<<<<<<< HEAD
	private boolean isMorethanMaxClients(int nMaxCliente, ArrayList<Cliente> listaclientes){
		return (listaclientes.size() > nMaxCliente );

	}

	public boolean isFull(){
		return ( this.nMaxCliente == listacliente.size());
=======
	private boolean isMaxCliente(Integer nMaxCliente, ArrayList<Cliente> listacliente){
		return (listacliente.size() >= nMaxCliente || nMaxCliente!=null);
	}

	public boolean isFull(){
		return isMaxCliente(this.nMaxCliente,this.listacliente);
>>>>>>> e7b6be29af61de2f544c0192d4908d31b3d629fd
	}
	
}
