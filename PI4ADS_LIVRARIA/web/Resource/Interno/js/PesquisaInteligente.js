/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function indicacao() {

    var frm = document.FormPesquisa;
    var herois = frm.herois.value;
    var confianca = frm.confianca.value;
    var amor = frm.amor.value;
    var comida = frm.comida.value;
    var medo = frm.medo.value;
    var deus = frm.deus.value;
    var imaginario = frm.imaginario.value;
    var desenho = frm.desenho.value;

    if (herois == "true") {
        if (confianca == "false") {
            if (amor == "false") {
                if (comida == "false") {
                    if (medo == "false") {
                        if (deus == "false") {
                            if (imaginario == "false") {
                                if (desenho == "false") {
                                  alert("Indica HQs");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "true") {
                if (amor == "false") {
                     if (comida == "false") {
                        if (medo == "false") {
                            if (deus == "false") {
                                if (imaginario == "false") {
                                    if (desenho == "false") {
                                        alert("Indica Auto Ajuda");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "true") {
                     if (comida == "false") {
                        if (medo == "false") {
                            if (deus == "false") {
                                if (imaginario == "false") {
                                    if (desenho == "false") {
                                        alert("Indica Romance");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "false") {
                     if (comida == "true") {
                        if (medo == "false") {
                            if (deus == "false") {
                                if (imaginario == "false") {
                                    if (desenho == "false") {
                                        alert("Indica Gastronomia");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "false") {
                     if (comida == "false") {
                        if (medo == "true") {
                            if (deus == "false") {
                                if (imaginario == "false") {
                                    if (desenho == "false") {
                                        alert("Indica Suspense");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "false") {
                     if (comida == "false") {
                        if (medo == "false") {
                            if (deus == "true") {
                                if (imaginario == "false") {
                                    if (desenho == "false") {
                                        alert("Indica Religioso");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "false") {
                     if (comida == "false") {
                        if (medo == "false") {
                            if (deus == "false") {
                                if (imaginario == "true") {
                                    if (desenho == "false") {
                                        alert("Indica Ficção");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else if (herois == "false") {
            if (confianca == "false") {
                if (amor == "false") {
                     if (comida == "false") {
                        if (medo == "false") {
                            if (deus == "false") {
                                if (imaginario == "false") {
                                    if (desenho == "true") {
                                        alert("Indica Infantil");
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    } else {
        alert("Desculpa... Sem Indicações");
        return  false;
    }
       
} //Do Metodo
$.confirm({
    theme: 'supervan' // 'material', 'bootstrap'
});




