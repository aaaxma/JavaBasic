class Quadrangle{
    public static void draw(Quadrangle q) {
    }
}

class Square extends Quadrangle{
    //SomeSentence
}

class Anything{
    //somesentence
}

public class Parallelogram {
    public static void main(String[] args) {
        Quadrangle q=new Quadrangle();
//        if(q instanceof Parallelogram){
//            Parallelogram parallelogram=(Parallelogram) q;
//        }
        if (q instanceof Square){
            Square s=(Square) q;
        }
    }
}
