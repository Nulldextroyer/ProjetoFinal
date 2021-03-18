package com.list;
import java.util.ArrayList;
import java.util.List;
import com.classes.*;



public class ListContrato {
	
	List<Contrato> listContrato = new ArrayList<Contrato>();
	
	public void inserirContrato(Contrato contrato) {
		listContrato.add(contrato);
	}

	public List<Contrato> getListContrato() {
		return listContrato;
	}	
	
}
