package HackerRank30days.Day21;

public class Generics{
    //comparar si a > B o B > a o que a = B, esto es para devolver el máximo
    //si A=B devuelve cualquiera
    //la forma de comparar es una especie de resta, por ejemplo si 
    //... a=3, b=5, devuelve -2, lo cual retornaría b ya que n<0
    //... a=5, b=2, devuelve 3, lo cual n>0 (else), por ende devuelve a
    //... a=5, b=5, n=0, en este caso el método devuelve cualquiera
    public static <T extends Comparable <T>> T findMax(T a,T b){
         int n = a.compareTo(b);
         if (n<0){
            return b;
         }else{
            return a;
         }
    }

    public static void main(String[] args){
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        //si es diferente da error, ejem: 2.0, 3
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax("a", "b"));
        System.out.println(findMax("Hello", "There"));
        //minuto 17!!!!!!
        //Generics k = new Generics();
        //System.out.println(findMax(k, k));
    }

    
}

