let margen = "1cm";

function moverHaciaDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecer();
    desaparecerYColor();
}

function moverHaciaIzquierda() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecer();
    desaparecerYColor();
}

function moverHaciaAbajo() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecer();
    desaparecerYColor();
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecer();
    desaparecerYColor();
}

// -------------------------------------SEGUNDO-------------------------------------------

function moverHaciaDerecha2(){
    let cuadrado = document.getElementById("cuadrado2");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecer();
}

function moverHaciaIzquierda2() {
    let cuadrado= document.getElementById("cuadrado2");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecer();
}

function moverHaciaAbajo2() {
    let cuadrado= document.getElementById("cuadrado2");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecer();
}

function moverHaciaArriba2() {
    let cuadrado= document.getElementById("cuadrado2");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecer();
}

//----------------------------------TERCERO--------------------------------------

function moverHaciaDerecha3(){
    let cuadrado = document.getElementById("circulo");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecerYColor();
}

function moverHaciaIzquierda3() {
    let cuadrado= document.getElementById("circulo");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen;
    desaparecerYColor();
}

function moverHaciaAbajo3() {
    let cuadrado= document.getElementById("circulo");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecerYColor();
}

function moverHaciaArriba3() {
    let cuadrado= document.getElementById("circulo");
    let nuevoValorDeMargenTop = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenTop + "cm";
    cuadrado.style.marginTop = margen;
    desaparecerYColor();
}

function desaparecer(){
let cuadrado = document.getElementById("cuadrado");
let posicionXdeCuadrado = cuadrado.getBoundingClientRect().x;
let posicionYdeCuadrado = cuadrado.getBoundingClientRect().y;

let cuadrado2 = document.getElementById("cuadrado2");
let posicionXdeCuadrado2 = cuadrado2.getBoundingClientRect().x;
let posicionYdeCuadrado2 = cuadrado2.getBoundingClientRect().y;

if(posicionXdeCuadrado == posicionXdeCuadrado2 && posicionYdeCuadrado == posicionYdeCuadrado2){
    cuadrado2.style.display="none";
}
else{
    cuadrado2.style.display="block";
}
}

function desaparecerYColor(){
    let cuadrado = document.getElementById("cuadrado");
    let posicionXdeCuadrado = cuadrado.getBoundingClientRect().x;
    let posicionYdeCuadrado = cuadrado.getBoundingClientRect().y;
    
    let circulo = document.getElementById("circulo");
    let posicionXdeCirculo = circulo.getBoundingClientRect().x;
    let posicionYdeCirculo = circulo.getBoundingClientRect().y;

    var aux = posicionXdeCuadrado == posicionXdeCirculo && posicionYdeCuadrado == posicionYdeCirculo;
    console.log(aux);
    
    if(posicionXdeCuadrado == posicionXdeCirculo && posicionYdeCuadrado == posicionYdeCirculo){
        circulo.style.display="none";
        cuadrado.style.backgroundColor="blueviolet";
    }
    else{
        circulo.style.display="block";
    }

    }