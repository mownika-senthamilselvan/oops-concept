package program1;

import java.util.ArrayList;

public class subarray {
    public static void main(String[] args) {

        ArrayList<Integer> arr1=new ArrayList<>();
        int[] arr={3,4,7,8,1,2,0,4};
        int max=Integer.MIN_VALUE,sum=0;
        int indexi=0,indexj=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum>max){
                    indexi=i;
                    indexj=j;
                    max=sum;
                }
            }
        }

        System.out.println(arr[indexi]);
        System.out.println(arr[indexj]);
        System.out.println(max);
    }
}
