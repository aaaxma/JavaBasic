import java.util.Arrays;
import java.util.List;


//冒泡排序，
public class Bubblesort {
    public static void main(String[] args) {
        int[] array=new int[]{42,43,64,15,93,53};
        Arrays.sort(array);

        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j <array.length-i ; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
            }
        }

        }
        for (int m:array){
            System.out.print(">"+m);
        }

    }


}
