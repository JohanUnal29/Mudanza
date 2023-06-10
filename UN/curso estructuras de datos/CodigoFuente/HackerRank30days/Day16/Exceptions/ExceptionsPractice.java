package HackerRank30days.Day16.Exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {
        // int[] intArray = new int[10];
        // System.out.println(intArray[10]);
        
        try{
            int[] intArrayC = new int[5];
            System.out.println("Element 6 at index 5 = "+intArrayC[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown"+e);
        }finally{
            System.out.println("Finally Finished try-catch");
        }

        
    }
}
