package calculadoraTest;
import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class sumaTest {

    Calculadora calc;

    @Before
    public void before(){
         calc = new Calculadora();
    }

    @Test
    public void sumaTest1(){

        int actualResult=calc.add(5,5);
        int expectedResult=10;
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);
    }

    @Test
    public void sumaTest2(){

        int actualResult=calc.add(5,6);
        int expectedResult=11;
        Assert.assertEquals("ERROR! el resultado es incorrecot",expectedResult,actualResult);
    }

    @Test
    public void sumaTest3(){

        int actualResult=calc.add(1,1);
        int expectedResult=2;
        Assert.assertEquals("ERROR! el resultado es incorrecot",expectedResult,actualResult);

    }

}
