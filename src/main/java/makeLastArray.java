import java.util.Arrays;

public class makeLastArray {

    static void  change (int A[],int index,int value){
        A[index]=value;
    }

    public static void main (String[] args){

         int arry [] = {1,2,3,5};
         int last [] = new int []{arry.length};


         int [] arry2 = Arrays.copyOf(arry,arry.length*2);

         System.arraycopy(arry, arry.length-1, arry2, arry2.length-1, last.length);


         int [] midarry2 = new int[] {arry2.length/2};
        System.arraycopy(arry,arry.length-1, midarry2,0, last.length);



        change(arry2,0,0);
        for(int x: arry2)
         {

             System.out.print(x + " ");
         }

    }

}
