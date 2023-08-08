public class doubleTwoThree {

    public static void main(String[] args){
        int a[] ={2,3};

        if(a.length==2){
            if(a[0]==2 && a[1]==2 || a[0]==3 && a[1]==3){
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }else {
            System.out.println("False");
        }
    }

}
