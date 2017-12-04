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
            $('#isbn').mask('00000-00000-00', {reverse: true});
            $('#ano').mask('0000');

        });

        function validacao() {
            var formulario = document.forms["FormLivro"];

            var nome = formulario.nome.value;
            var descricao = formulario.descricao.value;
            var numPaginas = formulario.numPaginas.value;
            var isbn = formulario.isbn.value;
            var qdtLivro = formulario.qdtLivro.value;
           
            var erro = false;

            if (nome.indexOf(" ") == -1) {
                alert("Preencha o Nome corretamente");
                erro = true;
            }
            if (descricao.indexOf(" ") == -1) {
                alert("Preencha o Descrição corretamente");
                erro = true;
            }
            if (numPaginas.length != 5) {
                alert("Preencha o Numero de Paginas corretamente");
                erro = true;
            }
            if (isbn.length != 14) {
                alert("Preencha o ISBN corretamente");
                erro = true;
            }
            
            if (qdtLivro.length != 6) {
                alert("Preencha o ISBN corretamente");
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
        


