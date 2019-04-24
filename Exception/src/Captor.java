
//在方法中使用throw关键字抛出异常
public class Captor {
    static int quotient(int x,int y)throws MyException{
        if (y<0){
            throw new MyException("除数不能为负");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try{
            int result=quotient(3,-1);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("程序出现了其他方面的异常");
        }
    }

}
