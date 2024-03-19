import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        boolean[] arr = {true, false, false, true, true, false, true};
        int count=0;
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length; i++){
            while(arr[i]){
                System.out.println("hello world");
                count++;
                if(count==25){
                    arr[i]=false;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }    
}
