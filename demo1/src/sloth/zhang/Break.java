package sloth.zhang;



public class Break {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for (int j = 0; j < 10; j++) {
                if (i==6){
                    break;
                }
                System.out.println("i="+i+"j="+j);
            }

        }
    }

}
