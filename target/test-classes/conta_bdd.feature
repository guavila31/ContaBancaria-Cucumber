@tag
Feature: Cliente faz saque de dinheiro como um cliente, eu gostaria de sacar dinheiroem caixa eletronico, para que eu nao trnha que esperar numa fila de banco.

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When For solicitado um saque no valor de 100 reais
    Then Deve efetuar o sque e atualizar o saldo da conta para -300 reais.

  @tag2
  Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente commum com saldo atual de -300 reais
    When solicitar um saque de 200 reais
    Then Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente
