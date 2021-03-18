package com.services;

import java.util.Calendar;
import java.util.Date;

import com.classes.Contrato;
import com.classes.Parcelas;

public class ServicoContrato {
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void ProcessarContrato(Contrato contrato, int meses) {
		double parcelaBruta = contrato.getValorTotal() / meses;
		for(int x = 1; x <= meses; x++ ) {
			double parcelaJ = parcelaBruta + servicoPagamentoOnline.juros(parcelaBruta, x);
			double parcelaFechada = parcelaJ + servicoPagamentoOnline.taxaDePagamento(parcelaJ);
			Date addDate = AdicionarMes(contrato.getData(), x);
			contrato.getParcelas().add(new Parcelas(addDate, parcelaFechada));
		}
	}
	
	private Date AdicionarMes(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
		
	}
}
