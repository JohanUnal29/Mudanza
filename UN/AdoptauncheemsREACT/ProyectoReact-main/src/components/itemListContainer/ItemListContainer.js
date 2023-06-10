/*#############################################
                 Importaciones
###############################################*/

//Modulos

//Estilos
import './ItemListContainer.css'

//Componentes
import ItemList from '../itemList/ItemList'


//Core

/*#############################################
                 Logica
###############################################*/
const ItemListContainer = (props) => {//Funcion constructora


    return(
        
        <div className='main-section'>
            <p>{props.greeting}</p>

            <div>
                <h1>BANER PUBLICITARIO</h1>
            </div>
            <ItemList />
        </div>
        
    )

}

/*#############################################
                 Exportacion
###############################################*/
export default ItemListContainer



