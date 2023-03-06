@data_tables  #birden fazla tag name koyabilirz
Feature: data_tables

  @regression
  Scenario: TC01_musteri_giris_testi
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici emaili ve sifresini girer
      | email                         | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then close the application

    # example yazmadik cunku s outline kullanmadik datatable kullandik