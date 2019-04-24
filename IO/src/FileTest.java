import java.io.File;
import java.sql.SQLOutput;

public class FileTest {
    public static void main(String[] args) {
        //File file=new File("D:/1.txt");
        //File file=new File(")
        File file=new File("D:/school/","letter.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else {
            try{
                file.createNewFile();
                System.out.println("文件已创建");
                String name=file.getName();
                long length=file.length();
                boolean hidden=file.isHidden();
                System.out.println("文件名字"+name);
                System.out.println("文件长度"+length);
                System.out.println("该文件是否为隐藏文件"+hidden);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
