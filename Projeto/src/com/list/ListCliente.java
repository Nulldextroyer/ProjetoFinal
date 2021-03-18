package com.list;

import java.util.ArrayList;
import java.util.List;
import com.classes.Cliente;

public class ListCliente {
List<Cliente> listCliente = new ArrayList<Cliente>();
	
	public void inserirCliente(Cliente cliente) {
		listCliente.add(cliente);
	}

	public List<Cliente> getListCliente() {
		return listCliente;
	}	
	
}
