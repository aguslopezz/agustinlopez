
    function mostrar_resultado_suma(){

    let primerNumero = $("#numero_1").val();
    let segundoNumero = $("#numero_2").val();

    let resultado_suma = parseInt(primerNumero) + parseInt(segundoNumero);
    
    $("#etiqueta1").text(resultado_suma);

    }

    function mostrar_resultado_resta(){

        let primerNumero = $("#numero_1").val();
        let segundoNumero = $("#numero_2").val();
    
        let resultado_resta = primerNumero - segundoNumero;
        
        $("#etiqueta1").text(resultado_resta);
    }

    function mostrar_resultado_multiplicacion(){

        let primerNumero = $("#numero_1").val();
        let segundoNumero = $("#numero_2").val();
    
        let resultado_multiplicacion = primerNumero * segundoNumero;
        
        $("#etiqueta1").text(resultado_multiplicacion);

    }

    function mostrar_resultado_division(){

        let primerNumero = $("#numero_1").val();
        let segundoNumero = $("#numero_2").val();
        
        let resultado_division = primerNumero / segundoNumero;
        
        $("#etiqueta1").text(resultado_division);

    }
