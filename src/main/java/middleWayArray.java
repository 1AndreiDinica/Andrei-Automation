public class middleWayArray {

    public static void main(String[] args) {

        int A [] = {1,2,3};

        int B [] ={4,5,6};

        int middleA [] = new int[]{A[A.length/2]};
        int middleB [] = new int[]{B[B.length/2]};

        int combo [] = new int[middleA.length + middleB.length];
        System.arraycopy(middleA, 0, combo, 0, middleA.length);
        System.arraycopy(middleB, 0, combo, middleA.length, middleB.length);

        for(int x:combo){

            System.out.print(x+" ");
        }



    }

}
