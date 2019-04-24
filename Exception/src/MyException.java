
//此为自己定义的异常类MyException,继承与Exception接口
public class MyException extends Exception{
    String message;
   public MyException(String ErrorMessage){
    message=ErrorMessage;
}
public String getMessage(){
       return message;
}
}
