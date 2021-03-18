package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import com.list.*;
import com.classes.*;
import com.enumeracao.*;
import com.persistencia.*;
import com.services.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException, IOException  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		final int mes = 3;
		
		List<Contrato> listContrato = new ArrayList<Contrato>();
		
		//administrador
		Administrador ad = new Administrador("roberto","roberto@png");
		System.out.println(ad);
		System.out.println( "\n ***********************************");
		
		//usuarioComun
		UsuarioComum user = new UsuarioComum(12345,477,true);
		System.out.println(user);
		System.out.println( "\n ***********************************");
		
		//cliente
		Cliente cli = new Cliente("felipe","felipe@019201931","bradesco", 1000,12345,2505,false);
		
		
		//carrinho 
		Carrinho car = new Carrinho(600,12039);
		System.out.println(car);
		System.out.println( "\n ***********************************");
		
		//contrato
		Contrato con = new Contrato(1234555,new Date(), 600);
		listContrato.add(con);
		
		
		//servico contrato 
		ServicoContrato cs = new ServicoContrato(new ServicoPagamento());
		cs.ProcessarContrato(con, mes);
		
		
		//pedido
		Pedido pe = new Pedido(105, new Date(), StatusPedido.valueOf("AGUARDADANDO_PAGAMENTO"));
		System.out.println(pe);
		System.out.println( "\n ***********************************");
		
		//Json
		List<Produtos> listProdutos = new ArrayList<Produtos>();
		Produtos prod = new Produtos("agua",1342,2);
		listProdutos.add(prod);
		
		prod = new Produtos("Coca",1231,5);
		listProdutos.add(prod);
		
		ManipJson.GravarJson(listProdutos);
		
		
		List<Produtos> listClienteJson = ManipJson.lerJSON();
		for (Iterator<Produtos> iterator = listClienteJson.iterator(); iterator.hasNext();) {
			Produtos comprador = (Produtos) iterator.next();
			System.out.println(comprador.toString());
		}
		System.out.println( "\n ***********************************");
		//Xml
		ListCliente listCliente = new ListCliente();
		cli = new Cliente("felipe","renan@auhsuahd","salvatory", 1000,12345,2505,false);
		listCliente.inserirCliente(cli);
		
		cli = new Cliente("fefaase","ahsduahsde@019201931","bradesco", 1000,12345,2505,false);
		listCliente.inserirCliente(cli);
		ManipXML.gravarXMLCliente(listCliente.getListCliente());	
		
		List<Cliente> list = ManipXML.lerXMLCOM();
		
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Cliente element = (Cliente) iter.next();
			System.out.println(element.toString());	
		}
		System.out.println("\n ***********************************");
		//parcelas por mes
		System.out.println("Valor das parcelas: ");
		for(Parcelas pa : con.getParcelas()) {
			System.out.println(pa);
		}
		
		//csv
		Scanner scan = new Scanner(System.in);
		FileWriter arq = new FileWriter("L:\\felip\\eclipse-workspace\\Projeto\\src\\contrato.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for (Contrato contrato : listContrato) {
			gravarArq.printf("%d | %s \n",contrato.getNumeroContrato(),contrato.getValorTotal());
		}
		arq.close();
		
		try {
			FileReader arq1 = new FileReader("L:\\felip\\eclipse-workspace\\Projeto\\src\\contrato.txt");
			BufferedReader lerArq = new BufferedReader(arq1);
			String line = lerArq.readLine();
			listContrato = new ArrayList<Contrato>();
				while (line != null) {
					String[] leitura = line.split("|");
					con = new Contrato();
					con.setNumeroContrato(Integer.parseInt(leitura[0]));
					con.setValorTotal(Integer.parseInt(leitura[2]));
					listContrato.add(con);
					line = lerArq.readLine();
				}
				arq.close();
		}catch (IOException e) {
			System.err.printf("Erro ao abrir aquivo:  %s. \n");
			e.getMessage();
		}
		
		arq.close();
	}
	
}
