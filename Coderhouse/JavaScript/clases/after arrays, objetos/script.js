// let productos = ["remera","pantalores","camisa"] //3...0-2

// for(let i=0;i<productos.length;i++){

//     console.log(productos[i]);

// }

// let productoCafe = [];// 0..1...2
// let preciosCafe = [];// 0=600

// productoCafe[0]= "cafe amargo";
// productoCafe[1]= "cafe dulce";


// console.log(productoCafe)

// productoCafe.push("Cafe salado");

// console.log(productoCafe)

// preciosCafe.push(600)//recomendable
// preciosCafe.unshift(500)// agrega precio inicio

// // ingreso de datos... cafe...eliminar...editar

// productoCafe.pop();//ultimo...."recomendable"
// productoCafe.shift();//elimina el primer elemento
// //.....................0............1...........2
// //productosCafe = [cafe amargo, cafe dulce, cafe salado]
// productoCafe.splice(1,1);
// productoCafe.splice(2,1);
// productoCafe.splice(0,3);



// switch(eliminar){
//     case 0:
//         productoCafe.splice(0,1);
//         break
//     case 1:
//         productoCafe.splice(1,1)
// }

// //indexOf..
// let elementoEliminar = productoCafe.indexOf('cafe amargo');//..0
// productoCafe.indexOf('cafe salado');//..2

// productoCafe.splice(elementoEliminar,1);

// let productoEliminar2 = prompt("Que elemento quieres eliminar")

//array.. objetos...clases..metodos


//objetos literales
// let producto1 = {
//     id: 001,
//     nombre: "remeras",
//     precio: 2500
// }

// let producto2 = {
//     id: 002,
//     nombre: "pantalon",
//     precio: 3500
// }

//Clases.. son moldes/matrices

class Producto {

    constructor(id,nombre,precio,fecha){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;

    }

}

const producto1 = new Producto(001,"oreo",350);
const producto2 = new Producto(002,"pincel fina",450);
const producto3 = new Producto(003,"cat chow",950);
const producto4 = new Producto(004,"brasil",150000);


console.log(producto1.nombre);
console.log(producto1);

//.............0..........1........2..........3
const BBDD =[producto1,producto2,producto3,producto4];

console.log(BBDD);

// for(let obj of BBDD){

//     // console.log(obj);
//     console.log(obj.id);
//     console.log(obj.nombre);
//     console.log(obj.precio);

// }

BBDD.forEach((el)=>{
    console.log(el.nombre)
})

let carrito = [];

//push...

carrito.push(BBDD[0]);

console.log(carrito);

carrito.push(BBDD[1]);

console.log(carrito);

function comprar(){
    carrito.push(BBDD[2]);
}


comprar();

let agregarProducto = prompt("ingrese un producto 1 cafe 2 colombiano")

function comprarDinamico(producto){
    carrito.push(BBDD[producto]);
}

comprarDinamico(2);






