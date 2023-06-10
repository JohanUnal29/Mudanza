/*#############################################
                 Importaciones
###############################################*/

//Modulos

//Estilos
import './ItemCategoryContainer.css'

//Componentes
import { useParams } from 'react-router-dom'
import ItemCategory from '../itemCategory/ItemCategory'


//Core

/*#############################################
                 Logica
###############################################*/
const ItemCategoryContainer = () => {//Funcion constructora

const {categoriaId} = useParams()
    return(
        
        <div className='main-section'>
            <ItemCategory categoria={categoriaId}/>
        </div>
        
    )

}

/*#############################################
                 Exportacion
###############################################*/
export default ItemCategoryContainer
