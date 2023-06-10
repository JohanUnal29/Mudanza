// console.log("hola objetos");

// const persona1 = {

//     nombre: "homero",
//     edad: 39,
//     calle: "Av siempre viva 742",
//     hambre: true

// }

// console.log(persona1);
// console.log(persona1.nombre);
// console.log(persona1.edad);
// console.log(persona1.calle);
// console.log(persona1.hambre);

// console.log(persona1.edad);

// persona1.edad = 36;

// let nombreProducto1 = "oreo";
// let precioProducto1 = 250;
// let stockProducto1 = 25;



// const producto01 = {

//     nombre: "oreo",
//     precio: 250,
//     stock: 25

// }

// const producto02 = {
//     nombre: "melba",
//     precio: 150,
//     stock: 30

// }

// const producto03 = {
//     nombre: "melba",
//     precio: 150,
//     stock: 30

// }

// console.log(producto02.precio * 2);
// console.log(producto01.precio + producto02.precio);


// function Producto(nombre,precio,stock){

//     this.nombre = nombre;
//     this.precio = precio;
//     this.stock = stock;

// }

// //instanciar
// const producto0001 = new Producto("oreo",250,25);
// const producto0002 = new Producto("papas",2000,30);
// const producto0003 = new Producto("pitusas",900,12);

// console.log(producto0001.nombre);
// console.log(producto0001.precio);


//  function SuperHeroes(nombre,color,poder,volar){

//      this.nombre = nombre;
//      this.color = color;
//     this.poder = poder;
//    this.volar = volar

//  }


//  const heroe1 = new SuperHeroes("batman","negro","millonario",false);


//  let nombre = prompt("ingrese el nombre del super heroe");
//  let color = prompt("ingrese el nombre del super heroe");
//  let poder = prompt("ingrese el nombre del super heroe");
//  let volar = prompt("ingrese el nombre del super heroe");
//  const heroe2 = new SuperHeroes(nombre,color,poder,volar)

// //  console.log(heroe1.volar);

// let cadena = "hola coders";

// console.log(cadena.length);
// console.log(cadena.toLowerCase());
// console.log(cadena.toCase());

// function Persona(nombre, edad, calle) {
//     this.nombre = nombre;
//     this.edad   = edad;
//     this.calle  = calle;

//     //metodos....
//     this.hablar = function(){ 

//         console.log("HOLA SOY "+ this.nombre)

//     }

//     this.saltar = function(){

//         console.log("hola estoy saltando")
//     }

//     this.mostrarProducto = function(){
//         console.log("el producto es: " + this.nombre)
//     }


// }

// const persona1 = new Persona("Homero", 39, "Av. Siempreviva 742");
// const persona2 = new Persona("Marge", 36, "Av. Siempreviva 742");

// persona1.hablar();
// persona1.saltar();
// persona2.hablar();
// persona2.saltar();






//  const persona10 = {
//     nombre: "marge", 
//     edad: 39, 
//     calle: "Av. Siempreviva 742",
  
//  };
 
//  console.log( "nombre" in persona10);
//  console.log( "stock" in persona10);
 

//  for (const propiedad in persona10) {
//     console.log(persona10[propiedad]);
//  }

//  //...nombre
//  //..edad
//  //..calle


//  class Persona{

//     constructor(nombre, edad, calle) 
//     {
//         this.nombre = nombre;
//         this.edad   = edad;
//         this.calle  = calle;
//     }

// }

// class Producto {

//     constructor(nombre,precio,stock){
//         this.nombre = nombre;
//         this.precio = precio;
//         this.stock = stock;
//     }

//     mostrar(){
//         console.log("soy el producto: "+ this.nombre);
//     }


// }

// const producto10 = new Producto("Cocosette",400,2);

// console.log(producto10.nombre)
// producto10.mostrar();


class Producto {
        constructor(nombre, precio) {
        this.nombre  = nombre.toUpperCase();
        this.precio  = parseFloat(precio);
        this.vendido = false;
    }
    sumaIva() {
        this.precio = this.precio * 1.21;
    }
    vender() {
        this.vendido = true;
    }
    sumarStock(){
        this.vendido = false;
    }
}
const producto1 = new Producto("arroz", "125");
const producto2 = new Producto("fideos","300");

console.log(producto1.precio)
producto1.sumaIva();
console.log(producto1.precio)
producto1.vender();
console.log(producto1.vendido);







