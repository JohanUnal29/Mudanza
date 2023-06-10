/*#############################################
                 Importaciones
###############################################*/

//Modulos
//Estilos

import Card from 'react-bootstrap/Card';
import {useCartContext} from '../../context/CartContex';

//Componentes

//Core

/*#############################################
                 Logica
###############################################*/
const CartItem = (props) => {//Funcion constructora

    const {title, category, description, price, id, count} = props.item
    const {borrarProductoDelCarrito} = useCartContext()

    const Borrar = () => {

       
            const producto = {
                id:id,
                
                } 
            
                borrarProductoDelCarrito(id)
            }    


    return (

        <Card className='card-separated'>
            <Card.Body>
                <Card.Title>{title}</Card.Title>
                <Card.Title>{id}</Card.Title>
                <Card.Title>{category}</Card.Title>
                <Card.Title>{description}</Card.Title>
                <Card.Title>{price}</Card.Title>
                <Card.Title>{count}</Card.Title>
                <button onClick={Borrar}>Quitar</button>
            </Card.Body>
        </Card>


    )

}

/*#############################################
                 Exportacion
###############################################*/
export default CartItem