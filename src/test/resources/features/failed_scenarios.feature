@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider
  Scenario: TC01_google_iphone_arama
    When kullanici "tea pot" icin arama yapar
    Then sonuclarda "toros" oldugunu dogrular
    Then close the application
  Scenario: TC02_google_tesla_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarda "bmw" oldugunu dogrular
    Then ekran goruntusu al
    Then close the application
