/*#############################################
                 Importaciones
###############################################*/

//Modulos
//Estilos
import './CardWidget.css'
//Componentes


//Core

/*#############################################
                 Logica
###############################################*/
const CardWidget = (props) => {//Funcion constructora

    return(

            <a>
            <ion-icon name="cart-outline"></ion-icon> {props.cantidad}
            </a>
        
    )

}


/*#############################################
                 Exportacion
###############################################*/
export default CardWidget



