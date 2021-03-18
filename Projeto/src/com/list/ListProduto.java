package com.list;

import java.util.ArrayList;
import java.util.List;

import com.classes.*;

public class ListProduto {
List<Produtos> listProdutos = new ArrayList<Produtos>();
	
	public void inserirProdutos(Produtos Produtos) {
		listProdutos.add(Produtos);
	}

	public List<Produtos> getListProdutos() {
		return listProdutos;
	}	
}
