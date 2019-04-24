import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {


    String content[]={"好久不见","最近好吗","再联系"};
    File file=new File("D:/wordd.txt");
    try{
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (int i=0;i<content.length;i++){
            bufferedWriter.write(content[i]);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }catch(Exception exception){
        exception.printStackTrace();
    }
    try{
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String s=null;
        int k=0;
        while ((s=bufferedReader.readLine())!=null){
            k++;
            System.out.println("第"+k+"行"+s);
        }
        bufferedReader.close();
        fileReader.close();
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
