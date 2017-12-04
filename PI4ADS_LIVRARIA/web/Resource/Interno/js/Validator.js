/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

                $('#cpf_form').bootstrapValidator({
                    feedbackIcons: {
                        valid: 'glyphicon glyphicon-ok',
                        invalid: 'glyphicon glyphicon-remove',
                        validating: 'glyphicon glyphicon-refresh'
                    },
                    fields: {
                        cpf: {
                            validators: {
                                callback: {
                                    message: 'Preencha Corretamente Validator ',
                                    callback: function (value) {
                                        return validacpf(value);
                                    }
                                }
                            }
                        }
                    }
                });
            });


