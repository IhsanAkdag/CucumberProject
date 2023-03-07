@arama_feature
Feature: arama_feature

  Background: googlea git
    Given kullanici google gider

  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarda "iphone" oldugunu dogrular
    Then close the application

  @smoke
  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarda "tesla" oldugunu dogrular
    Then close the application

  @smoke
  Scenario: TC03_water_arama
    When kullanici "water" icin arama yapar
    Then sonuclarda "water" oldugunu dogrular
    Then close the application

  @smoke
  Scenario: TC04_google_teapot_arama
    When kullanici "tea pot" icin arama yapar
    Then sonuclarda "tea pot" oldugunu dogrular
    Then close the application

  Scenario: TC05_google_pc_arama
    When kullanici "pc" icin arama yapar
    Then sonuclarda "pc" oldugunu dogrular
    Then close the application
