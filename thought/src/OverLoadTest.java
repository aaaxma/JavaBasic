public class OverLoadTest {
    public static int add(int a,int b){
        return a+b;
    }

    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a,double b){
        return 1;
    }
    public static int add(double a,int b){
        return 1;
    }

    //此方法也是重载方法，使用不定长参数形式
    public static int add(int... a){
        int s=0;
        for (int i = 0; i <a.length ; i++)
            s+=a[i];
        return s;
    }

    public static void main(String[] args) {
        System.out.println("调用第一个方法"+add(1,3));
        System.out.println("调用第二个方法"+add(2.3,4.1));
        System.out.println("调用第四个方法"+add(1,4.3));
        System.out.println("调用最后一个方法"+add(2,4,6,7,8,9));
    }
}
