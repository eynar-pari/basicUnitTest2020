package calculadoraTest;

import calculadora.Calculadora;
import org.junit.*;

public class Suma2Test {

    static Calculadora calc;

    @BeforeClass
    public static void beforeClass(){
        calc= new Calculadora();
    }

    @Before
    public void before(){
       // calc= new Calculadora();
    }

    @Test
    public void sumaTest1(){
        int actualResult=calc.add(5,6);
        int expectedResult=11;
        System.out.println("sumaTest1");
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);

    }
    @Test
    public void sumaTest2(){
        int actualResult=calc.getTotalResult();
        int expectedResult=0;
        System.out.println("sumaTest2");
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);
    }
    @Test
    public void sumaTest3(){
        int actualResult=calc.add(6,6);
        int expectedResult=12;
        System.out.println("sumaTest2");
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);
    }

    @After
    public void after(){
        calc.clean();
    }
}
