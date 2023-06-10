let nombres = ["jorge","juan","eloy"]

let persona = {
    nombre: "juan",
    edad: 454
}

let boton2 = document.getElementById("btnPrincipal2")

console.log(boton2)

boton2.addEventListener("click", respuestaClick2)

function respuestaClick2(){
    console.log("hola este es otro click")
    alert("holaaaaaaaaaa")
}



//pedir los valores de los inputs y mostrarlos en algun lugar


let usuario = document.getElementById("usuario");

let password = document.getElementById("pass");

//prueba de escritorio
console.log(usuario);
console.log(password);

let botonCaptura = document.getElementById("btnMainDatos")
console.log(botonCaptura);

botonCaptura.addEventListener("click", mostrarDatos)

// function mostrarDatos(){
//     console.log("funciona")

//     let usuarioCaptura = usuario.value

//     console.log(usuarioCaptura);

//     //creo el elemento con algun contenido
//     let valores = document.createElement("p") //creando etiquta <p> </p>

//     valores.innerHTML = "usuarios: " + usuarioCaptura // <p> usuarios </p>
//     //*********************** */

//     //*****lo ponga en algun lugar de pagina */
//     // document.body.appendChild(valores)

//     let contenedor1 = document.getElementById("mostrarDatos")

//     console.log(contenedor1);

//     contenedor1.appendChild(valores)

// }


let producto1 = {
    nombre: "mana",
    precio: 450
}

let producto2 = {
    nombre: "oreo",
    precio: 450
}


let producto3 = {
    nombre: "pamitos",
    precio: 450
}

let arrayObjetos = [producto1,producto2,producto3]









// let botonCaptura = document.getElementById("btnMainDatos")

// botonCaptura.addEventListener("click",mostrarDatos)

// botonCaptura.addEventListener("click",mostrarDatos2)

// function mostrarDatos(){
//     console.log("funciona")

//     let usuario = document.getElementById("usuario").value

//     let pass = document.getElementById("pass").value

//     let contenedor = document.getElementById("mostrarDatos")

//     let valores = document.createElement("p")

//     valores.innerHTML = "uu" + usuario + "pas" + pass

//     contenedor.appendChild(valores)

//     document.body.appendChild(valores)

    



// }

// function mostrarDatos2(){


//     console.log("funciona 2")

//     let usuario = document.getElementById("usuario").value

//     let pass = document.getElementById("pass").value

//     let contenedor = document.getElementById("mostrarDatos")

//     let valores = document.createElement("p")

//     valores.innerHTML = "uu" + usuario + "pas" + pass

//     contenedor.appendChild(valores)


// }



let botonMove = document.getElementById("move")

botonMove.addEventListener("mousemove",mover)

function mover(){
   console.log("mover")
}

// let tituloPrincipal = document.getElementById("titulo")

// tituloPrincipal.addEventListener("mouseover",estoyArriba)

// let contarVirus = 0;

// function estoyArriba(){
//     console.log("estoy arriba")
//     alert("hola soy virus")
//     confirm("quiere instalar un antivirus")
//     contarVirus++

    
// }


let up = document.getElementById("keyup")
// let down = document.getElementById("keydown")
up.onkeyup = () => {console.log("keyUp")}

let input3 = document.getElementById("keydown")

input3.onchange = () => {console.log("valor1 change")};



let input1  = document.getElementById("keyup")

input1.addEventListener('input', () => {
     console.log(input1.value)
})





// //-----Formulario-----

let miFormulario = document.getElementById("formulario");
miFormulario.addEventListener("submit", validarFormulario);

// function validarFormulario(e){
//     e.preventDefault();
//     console.log("Formulario Enviado");    
// }


function validarFormulario(e){
    //Cancelamos el comportamiento del evento
    e.preventDefault();
    //Obtenemos el elemento desde el cual se disparó el evento
    let formulario = e.target
    //Obtengo el valor del primero hijo <input type="text">
    console.log(formulario.children[0].value); 
    //Obtengo el valor del segundo hijo <input type="number"> 
    console.log(formulario.children[1].value);  
    console.log(formulario.children[2].value); 
}






//+++++++++++Agregar Objeto++++++++++++++++


let producto10 = {
    nombre: "casa",
    precio: 4565
}

let producto11 = {
    nombre: "casa 11",
    precio: 4565
}

let casas = [producto10,producto11]


botonCaptura.addEventListener("click",agregarObjetos)

function agregarObjetos(){

    let contenedor1 = document.getElementById("mostrarDatos")

    console.log(contenedor1);

    for(let objeto of arrayObjetos){


        console.log(objeto)
        contenedor1.append(objeto.nombre)

    }
}
   


