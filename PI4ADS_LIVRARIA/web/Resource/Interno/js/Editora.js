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
            $('#cpnj').mask('00.000.000/0000-00', {reverse: true});
            $('#cpf').mask('000.000.000-00', {reverse: true});
            $('#telefone').mask('(00)0000-0000');
            $('#cep').mask('00000-000');

        });

        function validacao() {
            var formulario = document.forms["FormEditora"];

            var cpf = formulario.cpf.value;
            var razaoSocial = formulario.razaoSocial.value;
            var representante = formulario.representante.value;
            var cnpj = formulario.cnpj.value;
            var telefone = formulario.telefone.value;
            
            var logradouro = formulario.logradouro.value;
            var complemento = formulario.complemento.value;
            var bairro = formulario.bairro.value;
            var cidade = formulario.cidade.value;
            var estado = formulario.estado.value;
            var cep = formulario.cep.value;
            


            var erro = false;

            if (razaoSocial.indexOf(" ") == -1) {
                alert("Preencha o Razao Social corretamente");
                erro = true;
            }
             if (representante.indexOf(" ") == -1) {
                alert("Preencha o Representante corretamente");
                erro = true;
            }
            if (cpf.length !== 14) {
                alert("Preencha o cpf corretamente");
                erro = true;
            }
            if (cnpj.length !== 14) {
                alert("Preencha o CNPJ corretamente");
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
        
        function formatar(mascara, documento) {

    var i = documento.value.length;
    var saida = mascara.substring(0, 1);
    var texto = mascara.substring(i)

    if (texto.substring(0, 1) != saida) {
        documento.value += texto.substring(0, 1);
    }
}
