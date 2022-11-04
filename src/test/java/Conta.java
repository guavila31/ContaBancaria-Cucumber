import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class conta {

	int contaEspecial;
	int contaComum;
	int saque;
	int saldoAtual = saque - contaEspecial;
	boolean tipoCliente;

	/**
	 * 
	 * @param Metodo que recebe o valor do saldo atual do cliente especial
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer conta) {
		// Write code here that turns the phrase above into concrete actions
		this.contaEspecial = conta;

		if (this.contaEspecial != conta) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do solitado do saque
	 * @return Se o true se o saque for valido
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer saldo) {
		// Write code here that turns the phrase above into concrete actions
		this.saque = saldo;

		if (this.saque != saldo) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * 
	 * @param Metodo deve efetuar o saque e atualizar a conta do cliente especial
	 */
	@Then("Deve efetuar o sque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_sque_e_atualizar_o_saldo_da_conta_para_reais(Integer saldo) {
		// Write code here that turns the phrase above into concrete actions
		this.tipoCliente = true;
		if (tipoCliente = true && this.contaEspecial < 0) {
			this.saldoAtual = saldo;
		} else {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do saldo atual do cliente comum
	 */
	@Given("Um cliente commum com saldo atual de {int} reais")
	public void um_cliente_commum_com_saldo_atual_de_reais(Integer saldo) {
		// Write code here that turns the phrase above into concrete actions
		this.contaComum = saldo;

		if (this.contaComum != saldo) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * 
	 * @param Metodo que recebe o valor do solitado do saque
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer saque) {
		// Write code here that turns the phrase above into concrete actions
		this.saque = saque;
		
		if(this.saque != saque) {
			throw new io.cucumber.java.PendingException();			
		}
	}

	/**
	 * @implNote Metodo que retorna uma mensagem para o cliente comum com saldo negativo
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		// Write code here that turns the phrase above into concrete actions
		if(this.tipoCliente = false) {
			System.out.print("Saldo insuficiente");
		}else {
			throw new io.cucumber.java.PendingException();			
		}
	}

}
