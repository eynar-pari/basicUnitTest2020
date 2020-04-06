package calculadoraTest;

import calculadora.Calculadora;
import org.junit.*;

public class SumaTest {

    Calculadora calc;

    @Before
    public void before(){
         System.out.println("@Before");
         calc = new Calculadora();
    }

    @After
    public void after(){
        System.out.println("@After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }

    @Test
    public void sumaTest1(){
        int actualResult=calc.add(1,6);
        int expectedResult=11;
        System.out.println("sumaTest1");
        Assert.assertEquals("ERROR! el resultado es incorrecto",expectedResult,actualResult);
    }

    @Test
    public void sumaTest2(){
        int actualResult=calc.add(5,6);
        int expectedResult=11;
        System.out.println("sumaTest2");
        Assert.assertEquals("ERROR! el resultado es incorrecot",expectedResult,actualResult);
    }

    @Test
    public void sumaTest3(){
        int actualResult=calc.add(1,1);
        int expectedResult=2;
        System.out.println("sumaTest3");
        Assert.assertEquals("ERROR! el resultado es incorrecot",expectedResult,actualResult);
    }

}
