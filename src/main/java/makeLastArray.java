import java.util.Arrays;

public class makeLastArray {

    static void  change (int A[],int index,int value){
        A[index]=value;
    }

    public static void main (String[] args){

         int arry [] = {7,8,11,15};
         int [] arr = new int[arry.length*2];

         change(arr, arr.length-1,arry[arry.length-1]);
        for(int x: arr)
         {
             System.out.print(x + " ");
         }

    }

}
