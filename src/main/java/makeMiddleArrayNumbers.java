public class makeMiddleArrayNumbers {

    public static void main(String[] args){

        int A [] = {1,2};


        if (A.length %2 == 0){
            System.out.println("The middle elements are: ");

            // even-length array (two middle elements)
            int x = A[(A.length/2) - 1];
            System.out.println(x);
            int y = A[A.length/2];
            System.out.println(y);
        }

        int[] midOne = new int [] {A[(A.length/2) - 1]};
        int [] midTwo = new int [] {A[(A.length/2)]};

        int comboMid [] = new int[midOne.length + midTwo.length];
        System.arraycopy(midOne, 0, comboMid, 0, midOne.length);
        System.arraycopy(midTwo, 0, comboMid, midOne.length, midTwo.length);

        System.out.println("New Array:");
        for (int x: comboMid)
        {

            System.out.print(x + " ");

        }


    }


}
