package com.persistencia;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.classes.Produtos;
import com.google.gson.Gson;
import com.sun.jdi.Type;

public class ManipJson {

	public static boolean GravarJson(List<Produtos> listProdutos) {

		Gson gson = new Gson();
		String json = gson.toJson(listProdutos);
		FileWriter writer;

		try {
			writer = new FileWriter("src/Json/Produtos.json");
			writer.write(json);
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static List<Produtos> lerJSON() {
		List <Produtos> listProdutos = new ArrayList<Produtos>();
		try(Reader reader = new FileReader("src/Json/Produtos.json")) {		
			java.lang.reflect.Type listType = new TypeToken<ArrayList<Produtos>>(){}.getType();
			listProdutos = new Gson().fromJson(reader, listType);
		} catch (IOException i) {
			i.printStackTrace();
		}
		return listProdutos;
	}

}
