package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty", // daha okunakli rapor icin gerekli
                "html:target/default-cucumber-reports.html", // html raporlarimizin yeri
                "json:target/json-reports/cucumber.json", // json raporlarimizin yeri
                "junit:target/xml-report/cucumber.xml", // junit raporlarimizin yeri
                "rerun:target/failed_scenarios.txt"  // fail olan senaryolari buraya kaydederiz
        },
        monochrome=true, // consolda raporlarin okunakli olmasi icin

        features = "./src/test/resources/features",  //features folder path
        glue = {"stepdefinitions","hooks"}, //stepdefinitions path | hook classinida buradan bagliyoruz
        tags = "@failed_scenario",
        dryRun = false

)

public class Runner {

}
// Bu sinif test case leri run etmek icin ve configuration icin kuallanilir
// Runner classi features file ile stepdefinitions biribirine baglar
