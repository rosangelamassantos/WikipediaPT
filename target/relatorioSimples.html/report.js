$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "##encoding: utf8"
    },
    {
      "line": 2,
      "value": "#Funcionalidade: Consulta"
    },
    {
      "line": 3,
      "value": "# Cenario: Consulta Ovo de Pascoa"
    },
    {
      "line": 4,
      "value": "#  Dado que acesso a Wikipedia em Portugues"
    },
    {
      "line": 5,
      "value": "# Quando pesquiso por \"Ovo de páscoa\""
    },
    {
      "line": 6,
      "value": "#Então exibe a expressão \"Ovo de páscoa\" no título da guia"
    }
  ],
  "line": 8,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3261436800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Consulta Ovo de Pascoa",
  "description": "",
  "id": "consulta;consulta-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "pesquiso por \"Ovo de páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "exibe a expressão \"Ovo de páscoa\" no título da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 2663145400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 1711654700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressãoNoTítuloDaGuia(String)"
});
formatter.result({
  "duration": 40770800,
  "status": "passed"
});
formatter.after({
  "duration": 927956900,
  "status": "passed"
});
});