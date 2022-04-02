import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;
import service.ContaService;

public class Main {

	public static void main(String[] args) {

		final int AGENCIA_PADRAO = 1;
		int SEQUENCIAL = 1;

		ContaService service = new ContaService();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		SEQUENCIAL++;
		//implementação de teste

		Conta cc =  ContaCorrente.builder()
									.cliente(venilton)
									.agencia(AGENCIA_PADRAO)
									.numero(SEQUENCIAL)
									.build();
		Conta poupanca = ContaPoupanca.builder()
												.cliente(venilton)
												.agencia(AGENCIA_PADRAO)
												.numero(SEQUENCIAL)
												.build();

		service.depositar(cc, 100);
		service.transferir(cc, poupanca, 100);
		service.imprimirExtrato(cc);
		service.imprimirExtrato(poupanca);
	}

}
