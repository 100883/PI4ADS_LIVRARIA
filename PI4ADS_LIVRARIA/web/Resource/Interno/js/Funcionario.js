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
            $('#ctps').mask('0000000-000', {reverse: true});
            $('#telefone').mask('(00) 0000-0000');
            $('#cep').mask('00000-000');

        });

        function validacao() {
            var formulario = document.forms["FormFuncionario"];

            var nome = formulario.nome.value;
            var cpf = formulario.cpf.value;
            var ctps = formulario.ctps.value;
            var telefone = formulario.telefone.value;


            var erro = false;

            if (nome.indexOf(" ") === -1) {
                alert("Preencha o Nome corretamente");
                erro = true;
            }
            if (cpf.length !== 14) {
                alert("Preencha o CPF corretamente");
                erro = true;
            }
            if (ctps.length !== 10) {
                alert("Preencha o CTPS corretamente");
                erro = true;
            }
            if (telefone.length !== 10) {
                alert("Preencha o Telefone corretamente");
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
        
        
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#tbody tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});


