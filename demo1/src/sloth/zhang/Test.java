package sloth.zhang;

//对于自增和自减运算符的一个例子

public class Test {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int k=0;
    /*
    * z=0时，x=1,不满足条件（++x>2）所以不执行后面条件，则y=0，k=0
    * z=1时，x=2，同理，y=0，k=0
    * z=2时，x=3满足第一个条件，然后执行第二个条件，则y=1，k=0
    * z=3时，x=4，y=2，k=0
    * z=4时，x=5，y=3，k=1
    *a++是先使用变量然后在加一
    * ++a是先加一然后再使用变量
    * */
        for (int z=0;z<5;z++){
            if ((++x>2)&&(++y>2)&&(k++>2)){
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x+""+y+""+k);
    }
}
