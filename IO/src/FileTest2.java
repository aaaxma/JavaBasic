import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest2 {
    public static void main(String[] args) {
        File file=new File("D:/word.txt");
        try{
            FileOutputStream out=new FileOutputStream(file);
            byte[] buy="我u一直是的哈手机号大数据库打卡机是 ".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream in=new FileInputStream(file);
            byte[] bytes=new byte[1024];
            int len=in.read(bytes);
            System.out.println("文件的信息是"+new String(bytes,0,len));
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
