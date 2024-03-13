package saucedemo.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTest {

	@Given("que eu não esteja logado")
	public void queEuNãoEstejaLogado() {
    // Iniciar Teste
	}

	@When("preencher o campo nome")
	public void preencherOCampoNome() {
    // Preencher Campo
	}

	@When("preencher a senha")
	public void preencherASenha() {
    // Preencher Campo
	}

	@When("clicar no botão login")
	public void clicarNoBotãoLogin() {
    // Clicar 
	}

	@Then("usuário logado")
	public void usuárioLogado() {
	}

	@When("preencher campo nome")
	public void preencherCampoNome() {

	}

	@When("preencher a senha errada")
	public void preencherASenhaErrada() {

	}

	@Then("mensagem de erro")
	public void mensagemDeErro() {

	}

}
