/*#############################################
                 Importaciones
###############################################*/

//Modulos
import { useState, useEffect} from 'react'

//Estilos
import './ItemList.css'

//Componentes
import Item from '../item/Item'


//Core

/*#############################################
                 Logica
###############################################*/
const ItemList = (props) => {//Funcion constructora
 
    const [productos,setProductos] = useState([])

    //preguntar categoria
    //preguntar cuantos queresmos traer
    //ordear alfabeticamente

//Nuesta Api de productos
// ------- archivo JSON => '../../misProductos.json'

useEffect(()=>{
    fetch('https://fakestoreapi.com/products')
.then(res=>res.json())
.then(json => setProductos(json.map(productos => <Item key={productos.id} id={"producto" + productos.id} data={productos}/>)))
},[])
    //Tenemos un retraso de informacion
//

    return(
        
        <div >
            <p>Este es el item List</p>
            {productos}
        </div>
        
    )

}

/*#############################################
                 Exportacion
###############################################*/
export default ItemList

