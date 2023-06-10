/***************************************
 *  Importaciones
 ***************************************/

//useContext (utilizar el contexto creado), createContext (Crear el contexto de la aplicacion) => react

import { useContext, createContext, useState, useEffect} from "react";


//1° Crear el contexto        Valor dentro del argumento de la funcion es el valor por default del contexto
//2° Exportar el contexto creado
export const CartContext = createContext()

//3° Crear nuestra funcion para poder usar el contexto
//4° podemos definirlo como un hook personalizado
//5° Exportar la funcion que almancena el hook useContext
export const useCartContext = () => { return useContext(CartContext)}


const productosLocalStorage = JSON.parse(localStorage.getItem('carrrito') || '[]')

//6° Crear el componente del contexto proveedor
const CartProvider = ({children}) => {

    //Estado del CartProvider
    const [items, setItems] = useState(productosLocalStorage)

    useEffect(()=>{
        localStorage.setItem('carrrito', JSON.stringify(items))
    },[items])

    //Funciones de nuestro CartProvider
    console.log(items);

    const agregarAlCarrito = (data) => {

        if (validarProductoExistente(data.id)) {
            const carritoActualizado = items.map((prod) => {
                if (prod.id === data.id) {
                    return { ...prod, count: prod.count + data.count }
                } else {
                    return prod
                }
            })
            setItems(carritoActualizado)
        } else {
            const listaActual = items
            listaActual.push(data)
            setItems(listaActual)
            console.log(items);
        }
        localStorage.setItem("carrrito", JSON.stringify(items));
    }

    const validarProductoExistente = (id) => {

        if(items.find(e=> e.id === id)) {
            return true
        } else {
            return false
        }

    }

    const borrarProductoDelCarrito = (id) => {
        const nuevaLista = items.filter(e => e.id !== id)
        setItems(nuevaLista)
    }

    const limpiarCarrito = () => {
        setItems([])
    }

    

    const total = () =>{
        let total = 0
               items.forEach((e) => total += (e.price*e.count))
               return total        
       }

    

    //Render de mi CartProvider
    return(
        <CartContext.Provider value={{items, agregarAlCarrito, borrarProductoDelCarrito, limpiarCarrito, total}}>
            {children}
        </CartContext.Provider>
    )
}

export default CartProvider
