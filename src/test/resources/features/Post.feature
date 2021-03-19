##encoding: utf8
  #Funcionalidade: Consulta
   # Cenario: Consulta Ovo de Pascoa
    #  Dado que acesso a Wikipedia em Portugues
     # Quando pesquiso por "Ovo de páscoa"
      #Então exibe a expressão "Ovo de páscoa" no título da guia

  Feature: Consulta
  Scenario: Consulta Ovo de Pascoa
    Given que acesso a Wikipedia em Portugues
    When pesquiso por "Ovo de páscoa"
    Then exibe a expressao "Ovo de páscoa" no titulo da guia