package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class DivTest {

    @Test(expected = ArithmeticException.class)
    public void divTest1(){
        Calculadora calculadora =new Calculadora();
        calculadora.div(5,0);
    }
}
