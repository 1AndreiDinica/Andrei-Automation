package org.example;

import java.util.Arrays;

 class arrayCheck {

    public int [] [] examples ={{1,3,4,5},{2,1,3,4,5},{2,1,4,1,3},{2,1,1},{2,1,1,3,4},{1},{1,1},{1,3}};

    public int [] keys = new int [3];

    public int[] getCurrentKeys(int array[]) {

        if (array.length>3) {
            int [] arr = {0,1,array.length-2};
            return arr;
        }else if (array.length==3) {
            int [] arr = {0,1};
            return arr;
        } else if (array.length==2) {
            int [] arr = {0};
            return arr;
        }

        int [] arr = {};
        return arr;
    }

    public  boolean check (int toCheck[], int keys[]) {
        for (int x: keys){
            if (toCheck[x]==1 && toCheck[x+1]==3) {
                return true;
            }
        }

        return false;
    }

    public void checkAll() {
        for(int [] toCheck: this.examples){
            System.out.println(Arrays.toString(toCheck));
            boolean checked;
            if(toCheck.length>1){
                this.keys = getCurrentKeys(toCheck);
                checked = check(toCheck,this.keys);
                System.out.println(checked);
            } else {
                System.out.println("Array too short " + Arrays.toString(toCheck));
            }
        }
    }
}

public class unluckyOneArray{

    public static void main(String args []){
        arrayCheck a = new arrayCheck();
        a.checkAll();

    }
}
