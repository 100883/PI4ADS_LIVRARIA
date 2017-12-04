/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validarInteligente() {

    var frm = document.FormPesquisa;
    //var tabela = document.getElementById("tabela");
    var herois = frm.herois.value;
    var pouca = frm.pouca.value;
    var muita = frm.muita.value;
    var lancamento = frm.lancamento.value;
    var antigo = frm.antigo.value;
    var reais = frm.reais.value;
    var estrangeiro = frm.estrangeiro.value;


    if (herois == "true") {
        if (pouca == "true") {
            if (muita == "false") {
                if (lancamento == "true") {
                    if (antigo == "false") {
                        if (reais == "false") {
                            if (estrangeiro == "true") {
                                alert("Indicacao Gibi");
                                return  true;
                            }
                        }
                    }
                }
            }
        }

   } else {
       alert("Outra Indicacao");
      return  false;
   }
    
    //-------------------------------------------------------------------------------------------------------------
       // var estrutura = " <p><h5> Prezado Cliente <strong> " + pouca + "</strong> o salario informado e "
      //  +"de  <strong> R$ " + muita + " </strong> </h5></p>" 
      //  + "<p><h5>  Com essa base salario o reajuste e de <strong> " + pouca + " </strong></h5></p> "
      //    + "<p><h5>  Mediante as informações o novo Salario sera de <strong> R$ : "+ lancamento + "</strong></h5></p>";
//-------------------------------------------------------------------------------------------------------------
       // tabela.innerHTML = estrutura;
//-------------------------------------------------------------------------------------------------------------
     //   return false;
}



