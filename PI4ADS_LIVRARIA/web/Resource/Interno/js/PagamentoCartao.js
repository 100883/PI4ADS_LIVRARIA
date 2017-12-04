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
            $('#numeroCartao').mask('0000-0000-0000-0000');
            $('#codigoSeguranca').mask('000');

        });

        function validacao() {
            var formulario = document.forms["FormPgtCartao"];

            var nomeTitular = formulario.nomeTitular.value;
            var numeroCartao = formulario.numeroCartao.value;
            var codigoSeguranca = formulario.codigoSeguranca.value;
            var quantParcelas = formulario.quantParcelas.value;
 
            var erro = false;

            if (nomeTitular.indexOf(" ") == -1) {
                alert("Preencha o Nome Titular corretamente");
                erro = true;
            }
            if (numeroCartao.length != 19) {
                alert("Preencha o Numero Cartao corretamente");
                erro = true;
            }
            if (codigoSeguranca.length != 3) {
                alert("Preencha o Codigo Seguranca corretamente");
                erro = true;
            }
            
              if (quantParcelas.length != 2) {
                alert("Preencha o Quantidade de Parcelas corretamente");
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
        


