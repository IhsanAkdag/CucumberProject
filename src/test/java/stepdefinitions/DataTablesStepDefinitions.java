package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("kullanici new butonuna tiklar")
    public void kullaniciNewButonunaTiklar() {
        Driver.waitAndClick(dataTablesPage.newButon,2);
    }

    @And("kullanici first name {string} girer")
    public void kullaniciFirstNameGirer(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @And("kullanici last name {string} girer")
    public void kullaniciLastNameGirer(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @And("kullanici positions {string} girer")
    public void kullaniciPositionsGirer(String positions) {
        dataTablesPage.position.sendKeys(positions);
    }

    @And("kullanici office {string} girer")
    public void kullaniciOfficeGirer(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("kullanici extension {string} girer")
    public void kullaniciExtensionGirer(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @And("kullanici start_date {string} girer")
    public void kullaniciStart_dateGirer(String start_date) {
        dataTablesPage.startDate.sendKeys(start_date);
    }

    @And("kullanici salary {string} girer")
    public void kullaniciSalaryGirer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("kullanici create buttonuna basar")
    public void kullaniciCreateButtonunaBasar() {
        dataTablesPage.create.click();
    }

    @When("kullanici first name ile {string} arar")
    public void kullaniciFirstNameIleArar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("firstname {string} in olustugunu test et")
    public void firstnameInOlustugunuTestEt(String firstname) {
        Assert.assertTrue(dataTablesPage.name.getText().contains(firstname));
    }

}
