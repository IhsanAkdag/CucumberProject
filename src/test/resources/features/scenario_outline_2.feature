@personel_olusturma
Feature: Personel olusturma

  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When  kullanici new butonuna tiklar
    And   kullanici first name "<firstname>" girer
    And   kullanici last name "<lastname>" girer
    And   kullanici positions "<positions>" girer
    And   kullanici office "<office>" girer
    And   kullanici extension "<extension>" girer
    And   kullanici start_date "<start_date>" girer
    And   kullanici salary "<salary>" girer
    And   kullanici create buttonuna basar
    When  kullanici first name ile "<firstname>" arar
    Then  firstname "<firstname>" in olustugunu test et

    Examples: personel_bilgileri
    | firstname | lastname | positions | office | extension | start_date | salary |
    | julie     | robert   | DEV       | ANKARA | 123       | 2023-04-12 | 45000  |
    | nine      | hide     | TESTER    | IZMIR  | 876       | 2023-05-12 | 32000  |
    | suzan     | sunny    | POWN      | MERSIN | 234       | 2023-07-12 | 56000  |