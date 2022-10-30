package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Callcenter {

	private ArrayList<Cliente> clientes;

	public Callcenter() {
		
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void agregarContacto(Cliente clientes) {
		this.clientes.add(clientes);
	}

	


	public boolean buscarCliente(Cliente clientes) {
		for (int i = 0; i < this.clientes.size(); i++) {
			if(this.clientes.get(i).equals(clientes)) {
				return true;
			}
		
	   }
		return false;
	}

	public boolean realizarllamada(Cliente clientes) {
		boolean llamada = buscarCliente(clientes);
		if(llamada == true) {
			return true;
		}
		return false;
		
	}

	public boolean realizarllamada(Cliente clientes, Cliente clientes1) {
		for (int i = 0; i < this.clientes.size(); i++) {
			if(!(clientes.getDireccion().equals(clientes1.getDireccion()))) {
				return true;
			}
		}
		return false;
		
		
	}
}
	

