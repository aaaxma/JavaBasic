
//在方法中使用throws关键字抛出异常
public class Shoot {
    static void pop() throws NegativeArraySizeException{
        int[] arr=new int[-3];
    }

    public static void main(String[] args) {
        try {
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop抛出的异常");
        }
    }

}
