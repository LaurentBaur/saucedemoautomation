@login @regressivo
Feature: Login
Como usuário
Quero informar dados
Para realizar login


Background: Acessar tela de login
Given que eu não esteja logado

@positivo @smoke
Scenario: Login Válido
When preencher campo nome
And preencher a senha
And clicar no botão login
Then usuário logado

@negativo
Scenario: Login senha inválida
When preencher campo nome
And preencher a senha errada
And clicar no botão login
Then mensagem de erro

