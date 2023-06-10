// // console.log("hola sumando cosas")

// // //and.. or...!... condicionales.. simples.. anidados

// // // let dia = 1;

// // // if(dia==1){
// // //     alert("es lunes");
// // // }else if(dia==2){
// // //     alert("es martes");
// // // }else if(dia==3){
// // //     alert("es miercoles");
// // // }else{
// // //     alert("eligio dia osvaldo");
// // // }




// // // switch(dia){

// // //     case  1: // ===
// // //         alert("es lunes");
// // //     break;
// // //     case  2:
// // //         alert("es martes");
// // //         break;
// // //     case 3:
// // //         alert("es miercoles");
// // //         break;
// // //     default:
// // //         alert("no has elegido nada")
// // //     break;

// // // }

// // let saldo = 50000;

// // let opcion = Number(prompt("elegir opcion cajero 1-consultar saldo 2-extraer 3-transferir"));


// // switch(opcion){

// //     case 1:
// //         alert("su saldo es: " + saldo);
// //     break;
// //     case 2:
// //         alert("extraer");
// //         if(saldo>0){
// //             alert("puede extraer euros")
// //         }else{
// //             alert("hacer changas para llegar a fin..")
// //         }
// //     break;
// //     case 3:
// //         alert("transferir");
// //     break;
// //     default:
// //         alert("ha presionado la pared")
// //     break;


// // }


// //ciclos repetitivos
// //ciclo while..


// // let nombre1 = prompt("ingres un nombre X");




// //contadores..
// /*

// contador = 0;

// contador = contador + 1;...1

// contador = contador + 1;...2

// contador = contador + 1; ...3

// contador += 1

// contador++ operador de incremento


// */

// let contador = 0;



// // operador decremento --
// /*

// vidas = vidas - 1

// vidas -= 1


// */

// // let vidas = 3;

// // while(vidas>0){

// //     alert("cantidad vidas");


    
// // }


// /*
// 1-0<5...true
// 2-1<5..true
// 3-2<5..true

// 5<5..false..


// */

// let vidas = 0;

// console.log(vidas)

// vidas = vidas + 3;

// vidas = vidas + 3;

// vidas += 3;

// vidas++;

// console.log(vidas)

// vidas = vidas - 1;
// vidas = vidas - 1;
// vidas = vidas - 1;
// vidas--;


//  while(true){

//     break;
//    console.log("alert ...");

//  }


// // let entrada = prompt("Ingresar un dato");
// // //gato

// // while((entrada != "ESC")){

// //     alert("El usuario ingresó " + entrada);
  
// //     entrada = prompt("Ingresar otro dato");


// //     if(entrada=="gato"){
// //         break;
// //     }

   

// //     //perro...ESC entrad="ESC"
// //     //"ESC"!="ESC"-->false
// // }

// // console.log(entrada);


// // do while

// // let contador2 = 15;

// // do{

// //     alert("ejecutando do while: " + contador2);

// //     // if(contador2==2){
// //     //     break;
// //     // }

// //     contador2++;

// // }while(contador2<5)


let productos;

let cantidadIngresos = Number(prompt("cuantos productos necesitas?"))

for(let i=0;i<cantidadIngresos;i++){

    // productos = prompt("ingrese un producto")
    
    // if(i==50){
    //     console.log("es 50");
    //     continue;
    // }

    productos = prompt("ingrese un producto")

    console.log("ciclo for: " + i);
}