
    function mostrardatos(){

    let nombre_ingresado = $("#nombre").val();
    let apellido_ingresado = $("#apellido").val();
    let edad_ingresada = $("#edad").val();

    $("#etiqueta1").text(nombre_ingresado);
    $("#etiqueta2").text(apellido_ingresado);
    $("#etiqueta3").text(edad_ingresada);

    $("#etiqueta1").css("color","red");
    $("#etiqueta2").css("color","green");
    $("#etiqueta3").css("color","blue");
    
    if(edad_ingresada>18){
        $("body").css("background-color","blue");
    }
    else
    $("body").css("background-color","green");

    }
