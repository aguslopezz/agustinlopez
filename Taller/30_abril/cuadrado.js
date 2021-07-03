let margen = "1cm";

function moverHaciaDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginLeft = margen;
}

function moverHaciaIzquierda() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen;
}

function moverHaciaAbajo() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
}