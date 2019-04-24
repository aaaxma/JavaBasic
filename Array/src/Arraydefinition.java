import java.util.Arrays;

public class Arraydefinition {


    public static void main(String[] args) {
        int[] arry={2,3,4,5,6};
        String[]  arrys={"zhang","ya","nan"};
        int array[]={5,4,0,2};
        for (int i = 0; i <4 ; i++) {
            System.out.println(arry[i]);
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(arrys[i]);
        }
        int[][] arrays={{3,2,3,5,5},{2,3,4,6,7}};
        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j <arrays[i].length ; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }

        //遍历数组
        int[][] array1=new int[][]{{1,3,4},{2,8,6},{3,6,4}};
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }

        //通过foreach来进行遍历数组
        int[][] array2=new int[][]{{1,3,6,5},{4,6,7,9},{3,5,3,2},{4,2,6,8}};
        int i=0;
        for (int x[]:array2          //先遍历外层数组，就相当于遍历一位数组
             ) {
            i++;
            int j=0;
            for (int e:x               //遍历内层数组，遍历每一个数组元素
                 ) {
                j++;
                if (i==array2.length&&j==x.length){
                    System.out.print(e);
                }else {
                    System.out.print(e+"、");
                }
            }

        }

        //fill方法
        int[] array3=new int[6];
        Arrays.fill(array3,8);
        System.out.println();
        for (int j = 0; j <array3.length ; j++) {
            System.out.print(array3[j]);
        }

        //fill方法
        int[] array4=new int [6];
        Arrays.fill(array4,1,2,3);
        System.out.println();
        for (int j = 0; j < array4.length; j++) {
            System.out.print(array4[j]);
        }

        //sort方法
        int[] array5=new int[]{4,4,3,2,5};
        Arrays.sort(array5);
        System.out.println();
        for (int j = 0; j <array5.length ; j++) {
            System.out.print(array5[j]);
        }


        //copyOf方法
        int[] array6=new int[]{4,2,9};
        int[]  array7=Arrays.copyOf(array6,6);
        System.out.println();
        for (int j = 0; j <array7.length ; j++) {
            System.out.print(array7[j]);
        }

        //copyOfRange方法
        int[] array8=new int[]{2,4,5,7,1};
        int[] array9=Arrays.copyOfRange(array8,2,4);
        System.out.println();
        for (int j = 0; j <array9.length ; j++) {
            System.out.print(array9[j]);
        }

        //数组查询方法binarySearch(int[] a, int key)
        int[] array0=new int[]{1,6,93};
        Arrays.sort(array0);
        int index=Arrays.binarySearch(array0,6);
        System.out.println("6的索引是"+index);

        //数组查询方法binarySearch(int[] a, int fromIndex, int toIndex,int key)
        int[] zhang=new int[]{8,4,5,3,5};
        Arrays.sort(zhang);
        int index1=Arrays.binarySearch(zhang,2,4,5);
        System.out.println("索引为"+index1);
    }

}
