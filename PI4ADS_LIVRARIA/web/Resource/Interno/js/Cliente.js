/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function confirmacao() {

            $.notify({
                message: 'Cadastro Realizado com sucesso'
            },
                    {
                        type: 'success'
                    });

            return true;
        }

        $(document).ready(function () {
            $('[data-toggle="tooltip"]').tooltip();
        });


        $(document).ready(function () {
            $('#cpf').mask('000.000.000-00', {reverse: true});
            $('#telefone').mask('(00)0000-0000');
            $('#cep').mask('00000-000');

        });

        function validacao() {
            var formulario = document.forms["FormCliente"];

            var nome = formulario.nome.value;
            var cpf = formulario.cpf.value;
            var telefone = formulario.telefone.value;
            var logradouro = formulario.telefone.value;
            var complemento = formulario.telefone.value;
            var bairro = formulario.telefone.value;
            var cidade = formulario.telefone.value;
            var estado = formulario.telefone.value;
            var cep = formulario.telefone.value;
            


            var erro = false;

            if (nome.indexOf(" ") === -1) {
                alert("Preencha o Nome corretamente");
                erro = true;
            }
            if (cpf.length !== 14) {
                alert("Preencha o CPF corretamente");
                erro = true;
            }
            if (telefone.length !== 10) {
                alert("Preencha o Telefone corretamente");
                erro = true;
            }
            
              if (logradouro.indexOf(" ") == -1) {
                alert("Preencha o Logradouro corretamente");
                erro = true;
            }
              if (complemento.indexOf(" ") == -1) {
                alert("Preencha o Complemento corretamente");
                erro = true;
            }
              if (bairro.indexOf(" ") == -1) {
                alert("Preencha o Bairro corretamente");
                erro = true;
            }
              if (cidade.indexOf(" ") == -1) {
                alert("Preencha o Cidade corretamente");
                erro = true;
            }
              if (estado.indexOf(" ") == -1) {
                alert("Preencha o Estado corretamente");
                erro = true;
            }
              if (cep.indexOf(" ") == -1) {
                alert("Preencha o CEP corretamente");
                erro = true;
            }

            if (erro) {
                erroconfirmacao();
                return false;
            } else {
                confirmacao();
                return true;
            }

        }
        //Validação da Do Cadastro com a Data de Nascimento
       function validarDataCadastro(input){
        if(input.value  < document.getElementById("dataNascimento").value){
            input.setCustomValidity('Corriga, o Data de Cadastro nao pode ser menor que a Data Nascimento');
        }else{
           input.setCustomValidity(''); 
        }
    }
    
    function validarIdade(input){
        if(input.value  < document.getElementById("dataNascimento").value){
            input.setCustomValidity('Corriga, o Data de Cadastro nao pode ser menor que a Data Nascimento');
        }else{
           input.setCustomValidity(''); 
        }
    }
    
     function validacaoIdade(){
         
        var formulario = document.forms["FormCliente"];
          
        var  dataNascimento  = formulario.dataNascimento.value;
        var  dataHoje  = formulario.dataHoje.value;
        var idade = (dataHoje - dataNascimento);
        var liberado = true;
        
        if (idade => 18){
           alert("Parabens você ja esta apto a efetuar o cadastro"); 
           liberado = false;
        }
        
          if (liberado) {
                return true;
            } else {
                confirmacao();
                return false;
            }
     }
    
    
        
       