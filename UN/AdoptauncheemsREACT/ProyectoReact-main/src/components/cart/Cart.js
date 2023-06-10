/*#############################################
                 Importaciones
###############################################*/

//Modulos


import {useCartContext} from '../../context/CartContex';
//Estilos
import './Cart.css'
import CartItem from '../cart/CartItem'

//Componentes
//Core

/*#############################################
                 Logica
###############################################*/
const Cart = () => {//Funcion constructora
   const {items, limpiarCarrito, total} = useCartContext();
   
   const tot = total()
   return(
      <>
      {items.map((e)=> <CartItem key={e.id} item={e}/>)}
      <button onClick={limpiarCarrito}>Limpiar</button>
      <h1>El total de la compra es: {tot}</h1>
      </>
      
      )

}

/*#############################################
                 Exportacion
###############################################*/
export default Cart
