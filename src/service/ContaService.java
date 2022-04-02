package service;

import domain.Conta;
import service.interfaces.IFuncoesConta;

public class ContaService implements IFuncoesConta{

    public void sacar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
    }

    @Override
    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }

    @Override
    public void transferir(Conta conta, Conta contaDestino, double valor) {
        sacar(conta, valor);
        depositar(contaDestino, valor);
    }

    @Override
    public void imprimirExtrato(Conta conta) {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns(conta);
    }

    protected void imprimirInfosComuns(Conta conta) {
        System.out.println(String.format("Titular: %s", conta.getCliente().getNome()));
        System.out.println(String.format("Agencia: %d", conta.getAgencia()));
        System.out.println(String.format("Numero: %d", conta.getNumero()));
        System.out.println(String.format("Saldo: %.2f", conta.getSaldo()));
    }

}
