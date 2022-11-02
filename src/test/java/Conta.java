import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

	int clienteEspecialSaldoAtual = -200;
	int saqueClienteEspecial = 100;
	int clienteComumSaldoAtual = -300;
	int saqueClienteComum = 200;
	int clienteEspecialSaldoNovo = clienteEspecialSaldoAtual - (saqueClienteEspecial);

	/**
	 * 
	 * @param Metodo que recebe o valor do saldo atual do cliente especial
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Conta conta = new Conta();

		conta.um_cliente_especial_com_saldo_atual_de_reais(clienteEspecialSaldoAtual);
		System.out.println("Cliente Especial com saldo de " + clienteEspecialSaldoAtual);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do solitado do saque
	 * @return Se o true se o saque for valido
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public boolean for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Conta saque = new Conta();

		saque.for_solicitado_um_saque_no_valor_de_reais(saqueClienteEspecial);
		System.out.println("For solicitado um saque de " + saqueClienteEspecial);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param Metodo deve efetuar o saque e atualizar a conta do cliente especial
	 */
	@Then("Deve efetuar o sque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Conta saldoNovo = new Conta();

		saldoNovo.for_solicitado_um_saque_no_valor_de_reais(clienteEspecialSaldoNovo);
		System.out.println("Deve efetuar o saque e atualizar a conta para " + clienteEspecialSaldoNovo);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do saldo atual do cliente comum
	 */
	@Given("Um cliente commum com saldo atual de {int} reais")
	public void um_cliente_commum_com_saldo_atual_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Conta contaComum = new Conta();

		contaComum.um_cliente_commum_com_saldo_atual_de_reais(clienteComumSaldoAtual);
		System.out.println("Cliente Comum com saldo de " + clienteComumSaldoAtual);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do solitado do saque
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Conta contaComum = new Conta();

		contaComum.solicitar_um_saque_de_reais(saqueClienteComum);
		System.out.println("For solicitado um saque de " + saqueClienteComum);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Metodo que retorna uma mensagem para o cliente comum com saldo negativo
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Saldo insuficiente");
		throw new io.cucumber.java.PendingException();
	}

}
