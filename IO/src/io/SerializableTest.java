package io;

import bean.Person;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //进行序列化
        ObjectOutputStream ooo=new ObjectOutputStream((new FileOutputStream("D:/data.txt")));
        Person person=new Person("zzzz",1);
        ooo.writeObject(person);
        ooo.close();

        //进行反序列化
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream("D:/data.txt"));
        Person person1=(Person)oos.readObject();
        System.out.println("name="+person1.getName()+"  "+"age="+person1.getAge());
        oos.close();
    }

}
