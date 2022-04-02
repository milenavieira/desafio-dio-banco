package service.interfaces;

import domain.Conta;

public interface IFuncoesConta {
	
	void sacar(Conta conta, double valor);
	
	void depositar(Conta conta, double valor);
	
	void transferir(Conta conta, Conta contaDestino,double valor);
	
	void imprimirExtrato(Conta conta);
}
