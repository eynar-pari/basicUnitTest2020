package calculadoraTest;

import calculadora.Calculadora;
import junit.framework.Assert;
import org.junit.Test;

public class RestaTest {

    @Test(timeout = 2500)
    public void restaTest1(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=2;
        int actualResult=calculadora.rest(4,2);
        Assert.assertEquals("ERROR!",expectedResult,actualResult);
    }

}
