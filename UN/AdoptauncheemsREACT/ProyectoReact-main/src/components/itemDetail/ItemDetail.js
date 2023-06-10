/*#############################################
                 Importaciones
###############################################*/

//Modulos
import { useState } from 'react';
import {useCartContext} from '../../context/CartContex';

//Estilos
import './ItemDetail.css'
//Componentes

import Card from 'react-bootstrap/Card';
import ItemCount from '../itemCount/ItemCount';


//Core

/*#############################################
                 Logica
###############################################*/
const ItemDetail = (props) => {//Funcion constructora

    const {agregarAlCarrito} = useCartContext()

const [cantidadDeProductosAComprar, setCantidadDeProductosAComprar] = useState(0)

const {id, title, category, description, price } = props.data


const funcionDelHijoDeGuardarCantidad = (cantidadX) => {
    setCantidadDeProductosAComprar(cantidadX)
}


const onAdd = () => {

if(cantidadDeProductosAComprar != 0) {
    const producto = {
        id:id,
        title:title,
        category:category,
        price:price,
        count:cantidadDeProductosAComprar + 1,
        } 
    
       agregarAlCarrito(producto)
}else{
    alert("No te olvides de añadir productos")
}

}

//

    return (

        <article className='itemDetail-producto'>
            <h1>DETALLE DEL PRODUCTO SELECCIONADO</h1>
            <Card className='card-separated'>
                <Card.Header as="h5">{category}</Card.Header>
                <Card.Body>
                    <Card.Title>{title} || Value ={price}</Card.Title>
                    <Card.Text>
                        {description}
                    </Card.Text>

                    <ItemCount stock={10} guardarCantidadAComprar={funcionDelHijoDeGuardarCantidad}/>
                    <button onClick={onAdd} className="btn-buy">On Add</button>
                </Card.Body>
            </Card>
        </article>


    )

}

/*#############################################
                 Exportacion
###############################################*/
export default ItemDetail