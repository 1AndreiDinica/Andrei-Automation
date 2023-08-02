public class makeMiddleThreeArray {

    public static void main (String[] args){

        int [] A = {1,2,3};

        int[] midOne = new int [] {A[(A.length/2) - 1]};
        int [] midTwo = new int [] {A[(A.length/2)]};
        int [] midThree = new int[] {A[A.length/2]+1};


        int comboMid [] = new int[midOne.length + midTwo.length + midThree.length];
        System.arraycopy(midOne, 0, comboMid, 0, midOne.length);
        System.arraycopy(midTwo, 0, comboMid, midOne.length, midTwo.length);
        System.arraycopy(midThree,0,comboMid,2,midThree.length);


        System.out.println("New Array:");
        for (int x: comboMid)
        {

            System.out.print(x + " ");

        }


    }



}
