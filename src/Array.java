import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int []a=new int[4];
        for(int i=0;i<4;i++){
            a[i]=i;
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
//        for(int element:a)
//            System.out.println(element);
    }
}
