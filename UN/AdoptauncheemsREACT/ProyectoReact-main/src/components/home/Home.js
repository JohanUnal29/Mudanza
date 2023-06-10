/*#############################################
                 Importaciones
###############################################*/

//Modulos
//Estilos
import './Home.css'
//Componentes
import Carousell from '../subComponents/carousel/Carousel'
import Banner from '../subComponents/bannerSlideRight/Banner'
//Core

/*#############################################
                 Logica
###############################################*/
const Home = () => {//Funcion constructora

    console.log("Home");
    return(
      <div>
        <Carousell/>
        <Banner/>
      </div>  
      
        
    )

}

/*#############################################
                 Exportacion
###############################################*/
export default Home
