package calculadora;

public class Calculadora {

    public Calculadora(){

    }

    public int add(int a, int b){
        return a+b;
    }

    public int rest(int a, int b){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a-b;
    }

    public int mult(int a, int b){
        //not implemented
        return 0;
    }

    public int div(int a,  int b){
        if (b ==0 )
            new ArithmeticException(" EXCEPTION !! division entre 0 no esta permitido");

        int result= a/b;
        return result;
    }
}

