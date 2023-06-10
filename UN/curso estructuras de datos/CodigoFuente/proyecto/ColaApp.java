package proyecto;

public class ColaApp {

	public static void main(String[] args) {
		Cola cola = new Cola(100);
		Cola cola2 = new Cola(100);
		
		
		//vamos a crear un json que va llenar nuestra cola, dicha cola va iterar hasta encontrar los 
		//objetos que cumplan con dicho atributo
		cola.insertar("golden");
		cola.insertar("labrador");
		cola.insertar("pincher");
		cola.insertar("samoyedo");
		cola.insertar("bulldog");
		
		System.out.println("");
		System.out.print("ELEMENTO EN LA CABEZA DE LA COLA: ");
		System.out.print(cola.frenteCola());
		System.out.println("");
		
		System.out.print("ESTA COLA VACIA? ");
		System.out.println(cola.colaVacia());
		
		System.out.print("ESTA LA COLA LLENA? ");
		System.out.println(cola.colaLLena());
		
		System.out.print("TAMA�O DE LA COLA: ");
		System.out.println(cola.tamanoCola());
		
		while(!cola.colaVacia()) {
			Object m = cola.quitar();
			System.out.print(m);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
