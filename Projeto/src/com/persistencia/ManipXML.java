package com.persistencia;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import com.classes.Cliente;
import com.list.*;

public class ManipXML {
	
	final static String NOMEDOARQUIVO = "clientes";
	final static String LOCALHOST = "src/xml/";
	
	public static boolean gravarXMLCliente(List<Cliente> listCliente){		//
		
		Element config = new Element("Clientes");

		
		Document documento = new Document(config);

		Element titulo = new Element("titulo");
		titulo.setText("Cadastro de Clientes");
		
		config.addContent(titulo);
		;
		
		for (int x = 0; x < listCliente.size(); x++){
			Element cliente = new Element("cliente");
			
			cliente.setAttribute("codigo", String.valueOf(listCliente.get(x).getUserId()));
			
			Element nome = new Element("nome");
			nome.setText(listCliente.get(x).getNomeUsuario());

			Element email = new Element("email");
			email.setText(listCliente.get(x).getEmail());

			Element cartaoCredito = new Element("cartaoCredito");
			cartaoCredito.setText(listCliente.get(x).getCartaoCredito());
			
						
			cliente.addContent(nome);
			cliente.addContent(email);
			cliente.addContent(cartaoCredito);
			config.addContent(cliente);			
		}

		
		XMLOutputter xout = new XMLOutputter();	
		try {
			
			System.out.println(NOMEDOARQUIVO + ".xml");
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(LOCALHOST +  NOMEDOARQUIVO + ".xml"),"UTF-8"));
			
			xout.output(documento, arquivo);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static List<Cliente> lerXMLCOM(){
		List<Cliente> listaCli = new ArrayList<Cliente>();
		Document doc = null;
		SAXBuilder builder = new SAXBuilder();	
		try { 
			doc = builder.build(LOCALHOST + NOMEDOARQUIVO + ".xml");
		} catch (Exception e) {
			e.printStackTrace();
		}            
		Element config = doc.getRootElement();
		List listCliente = config.getChildren("cliente");
		
		for (Iterator iter = listCliente.iterator(); iter.hasNext();) {
			Element element = (Element) iter.next();
			Cliente cli = new Cliente();
			cli.setUserId(Integer.parseInt(element.getAttributeValue("codigo")));
			cli.setNomeUsuario(element.getChildText("nome"));
			cli.setEmail(element.getChildText("email"));
			cli.setCartaoCredito(element.getChildText("cartaoCredito"));
			listaCli.add(cli);
		}
		return listaCli;
	}	
}
