package com.services;

public interface ServicoPagamentoOnline {
	double taxaDePagamento(double quantia);
	double juros(double quantia, int meses);
}
