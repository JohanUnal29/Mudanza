// let nombre = prompt("ingrese un nombr");

// console.log(nombre);

// function saludar() {

//     console.log("hola chicos.. es jueves");

// }

// saludar();
// saludar();

// function x(){
//     alert("hola coder!!");
// }

// x();
// x();


//string, numeros (enteros, decimales), booleans
function conParametro(nombre){

    console.log("tu nombres es:" + nombre);

}

conParametro("Jazmin");
conParametro("juan carlos");
conParametro("analia")

function unNumero(numero){

    console.log(numero);
    console.log(numero + numero);

}

unNumero(5);
unNumero(10);
unNumero(10.5);

function conDosParametros(apellido,nombre,edad,soyRobot){
//apellido..jamin.. nombre..torrez.
    if(edad>18){
        console.log("tu nombres es: " + nombre);
        console.log("tu apellido es: " + apellido);
        console.log("tu edad es: " + edad);
    }else{
        console.log("algo...........")
    }
}


// conDosParametros("Jazmin","torrez",15,false);


// let resultado = 0;

// function sumar(primerNumero, segundoNumero) {
//     resultado = primerNumero + segundoNumero
//     // resultado = 0;
// }

//  function mostrar(mensaje) {
//      console.log(mensaje)
//  }

// //  mostrar(resultado);
//  sumar(6, 3);
//  mostrar(resultado);

//  function sumaNumeros(numeroA,numeroB){

//     let resultado = numeroA + numeroB;

//     if(resultado>10){
//         return resultado
//     }

//  }

//  let resultadoSuma = sumaNumeros(10,15);

//  console.log(resultadoSuma);


//  function calculadora(primerNumero, segundoNumero, operacion) {

//     switch (operacion) {
//         case "+":
//             return primerNumero + segundoNumero;
//             break;
//         case "-":
//             return primerNumero - segundoNumero;
//             break;
//         case "*":
//             return primerNumero * segundoNumero;
//             break;
//         case "/":
//             return primerNumero / segundoNumero;
//             break;
//         default:
//             return 0;
//             break;
//     }
// }

// let valorCalc = calculadora(5, 5, "+");

// console.log(valorCalc);


// let resultado = 0 // varible del tipo global

// let resultado = 0;//global
// let saldo = 150000;

// function sumar(primerNumero, segundoNumero) {

//     //variable local....
//     let resultado = primerNumero + segundoNumero;
//     console.log(resultado);

   

// }

// sumar(1,1);//

// console.log(resultado);//


const suma = function(a,b,c,d){
    return a+b
}

const suma2 = (a,b) => {return a+b}
//const suma2 = (a,b) => a+b

console.log(suma(10,15));


// const suma  = (a,b) => a + b


function suma(a,b){
    return a + b
}

function resta(a,b){
    return a-b
}

// const iva   = x => x * 0.21

function iva (x){
    return x * 0.21
} 


