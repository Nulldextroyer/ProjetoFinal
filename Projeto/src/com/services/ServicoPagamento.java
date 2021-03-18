package com.services;

public class ServicoPagamento implements ServicoPagamentoOnline {

	public static final double TAXA_PAGAMENTO = 0.02;
	public static final double TAXA_JUROS = 0.01;
	@Override
	public double taxaDePagamento(double quantia) {
		// TODO Auto-generated method stub
		return quantia * TAXA_PAGAMENTO;
	}

	@Override
	public double juros(double quantia, int meses) {
		// TODO Auto-generated method stub
		return quantia * meses * TAXA_JUROS;
	}

}
