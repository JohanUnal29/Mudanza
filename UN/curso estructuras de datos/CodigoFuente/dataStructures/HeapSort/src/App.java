public class App {
    static int total;

    static void swap(Comparable[] arr, int a, int b){
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void heapify(Comparable[] arr, int i){
        int lft = i*2;
        int rgt = i*2+1;
        int grt = i;
        //acá miramos si en la izquieda es mayor que el padre para cambiar
        //por el padre
        if(lft <= total && arr[lft].compareTo(arr[grt])>=0)
            grt=lft;
        //acá miramos si en la derecha que el padre es mayor para cambiar
        //por el padre
        if(rgt <= total && arr[rgt].compareTo(arr[grt])>=0)
            grt=rgt;
        
        if(grt!=i){
            swap(arr,i,grt);
            heapify(arr, grt);
        }
        
    }
    static void sort(Comparable[] arr){
        total = arr.length-1;
        for(int i=total/2;i>=0;i--)
            heapify(arr, i);
        for(int i=total;i>0;i--){
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }     
    }
    
    public static void main(String[] args){
        Integer[] arr={592,513,182,376,123,900,819,909,33,181,104,136,441,552,685,92,312,50,959,561,954,243,352,806,478,719,408,497,889,50,930};
        System.out.println("Before Sort");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+"\t");
        sort(arr);
        System.out.println("\nAfter Sort");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+"\t");
    }
}