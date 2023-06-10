/*#############################################
                 Importaciones
###############################################*/

//Modulos
import { useState } from 'react'
//Estilos
import './ItemCount.css'
//Componentes
//Core

/*#############################################
                 Logica
###############################################*/
const ItemCount = (props) => {//Funcion constructora

    //props.stock = "7"
    //No puede restar menos de 0
    //No puede sumar mas de la cantidad maxima en stock

    //Agregar un manejo de Estado
    //useState
    const [count, setCount] = useState(0)

    //Funciones de sumar uno con un maximo de sock

    const addOne = () => {
        if (count < props.stock) {
            setCount(count + 1)
            props.guardarCantidadAComprar(count)
        }
    }




    //Funcion de restar uno al contador seteando un minimo
    const disOne = () => {
        if (count > 0) {
            setCount(count - 1)
            props.guardarCantidadAComprar(count)
        }

    }

    return (

        <div className='box-count'>
            <div className='box-count-children'>
                <button onClick={addOne} className="btn-add">+</button>
                <p >{count}</p>
                <button onClick={disOne} className="btn-dis">-</button>
            </div>
        </div>

    )

}

/*#############################################
                 Exportacion
###############################################*/

export default ItemCount
