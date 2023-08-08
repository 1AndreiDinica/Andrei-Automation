import java.util.Arrays;

public class frontEleven {
    public static void main(String[] args){

        int a[] ={};
        int b[] ={2,3};
        int c[];

        if(a.length+b.length==0){
            c = new int [0];
        }else if(a.length==0) {
            c = new int[1];
            c[0]=b[0];
        }else if(b.length==0){
            c = new int[1];
            c[0]=a[0];
        }else {
            c=new int[2];
            c[0]=a[0];
            c[1]=b[0];

        }

        System.out.println(Arrays.toString(c));


    }
}
