package sloth.zhang;

//java打印杨辉三角
public class Sanjiao {

    public static void main(String[] args) {

        {
            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * (5 - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }}
