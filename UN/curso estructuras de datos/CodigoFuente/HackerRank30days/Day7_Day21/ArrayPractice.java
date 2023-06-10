package HackerRank30days.Day7_Day21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    //método generico acepta cualquier tipo de entrada
    public static <E> void printArray(E[] array){

        for(E element : array){
            System.out.print(element+" ");
        }
        System.out.println();

        // for(int i = 0; i<array.length; i++){
        //     E item = array[i];
        //     System.out.print(item);
        //     if(i < array.length - 1){
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");
    }

    // public static void printArray(String[] array){
    //     System.out.print("[");
    //     for(int i = 0; i<array.length; i++){
    //         String item = array[i];
    //         System.out.print(item);
    //         if(i < array.length - 1){
    //             System.out.print(", ");
    //         }
    //     }
    //     System.out.println("]");
    // }
    
    
    public static void main(String[] args){
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {5,2,9,1,3};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        //minuto 6:37
        String[] shoppingList = {"bananas", "apples", "pears"};

        //Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        //custom print out arrays
        printArray(intArray2);
        printArray(intArray3);

        //Retrieve objects
        System.out.println();
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2,3));
        System.out.println();

        //Given functions
        Arrays.sort(intArray3);
        System.out.println("Array 3 organaize");
        printArray(intArray3);

        //Print String array (no es bueno tener dos métodos iguales)
        printArray(shoppingList);

        System.out.println("Special For Loop:");
        //FOR LOPP: FOREACH
        for(String s:shoppingList){
            System.out.println(s);
            //System.out.println("Hi");
        }
    }
}
