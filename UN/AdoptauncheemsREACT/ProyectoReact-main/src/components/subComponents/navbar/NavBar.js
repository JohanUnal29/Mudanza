/*#############################################
                 Importaciones
###############################################*/

//Modulos
import { Link } from 'react-router-dom'
//Estilos
import './NavBar.css'
import CardWidget from '../../cardWidget/CardWidget.js'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';


//Componentes
//Core

/*#############################################
                 Logica
###############################################*/
function NavScrollExample() {
    return (
      <Navbar className="nav-grande sticky-top" bg="white" expand="lg">
        <Container fluid>
          
          <Navbar.Brand><Link to="/"><a class="navbar-brand col-6" href="./index.html">
                            <img class="logotipo" src="https://drive.google.com/uc?export=download&id=1tBsb0t3bUc1vG8BzvAs0wuCOBos_2_fa" alt="Logo de Dasein"/>
                          </a> </Link></Navbar.Brand>
                          
          <Navbar.Toggle aria-controls="navbarScroll" />
          <Navbar.Collapse id="navbarScroll">
            <Nav
              className="me-auto my-2 my-lg-0"
              style={{ maxHeight: '100px' }}
              navbarScroll
            >
              
              <NavDropdown title="Accesorios" className="Menu" id="navbarScrollingDropdown">
                
                <NavDropdown.Item href="#action3">
                  <Link className="Menu" to="/productos">Todos los Accesorio</Link>
                </NavDropdown.Item>
                <NavDropdown.Item href="#action4">
                  <Link className="Menu" to="/categoria/jewelery">Aretes</Link>
                </NavDropdown.Item>
              </NavDropdown>
              <Nav.Link><Link className="Menu" to="/">Home</Link></Nav.Link>
              <Nav.Link><Link className="Menu" to="/contacto">contacto</Link></Nav.Link>
              <Nav.Link><Link className="Menu" to="/nosotros">Somos Dasein</Link></Nav.Link>
              <Nav.Link className="Menu" target="_blank" href="https://www.instagram.com/dasein.accesorios/?igshid=Yzg5MTU1MDY%3D">Ir a @dasein.outfit</Nav.Link>
            </Nav>
            
            
            <Link to="/carrito"><CardWidget cantidad="10" /></Link>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    );
  }

/*#############################################
                 Exportacion
###############################################*/
export default NavScrollExample;





/*

Padre -> Hijo

Padre (propiedades) -> Hijo

padre{
    propiedad{
        //todos los atributos que escribos en la etiqueta
        saludo = "asd",
        despedida = "asd"
    }
}




*/


