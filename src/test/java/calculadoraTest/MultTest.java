package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MultTest {

    @Test
    @Ignore("Funcionalidad No Implementada")
    public void multtest1(){
        Calculadora calculadora= new Calculadora();
        int actualResult=calculadora.mult(2,3);
        int expectedResult=6;
        Assert.assertEquals("ERROR en multiplcacion",expectedResult,actualResult);
    }
}
