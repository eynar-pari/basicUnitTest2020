package specialTest;
import org.junit.*;
import special.pregunta1.Pregunta1;

public class Respuesta1Test {

    Pregunta1 pregunta1;

    @Before
    public void before(){
        System.out.println("@Before");
        pregunta1 = new Pregunta1("TEST",2000);
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
    public void verifyEdad(){
        int actualResult=pregunta1.getEdad();
        int expectedResult=20;
        Assert.assertEquals("ERROR! Edad Incorrecta",expectedResult,actualResult);
    }

    @Test
    public void verifyGetID(){
        String actualResult=pregunta1.getId();
        String expectedResult="42000";
        Assert.assertEquals("ERROR! Edad Incorrecta",expectedResult,actualResult);
    }

    @Test
    public void verifyEdadDigit(){
        pregunta1 = new Pregunta1("TEST",2019);
        int actualResult=pregunta1.getEdad();
        int expectedResult=1;

        Assert.assertEquals("ERROR! Edad Incorrecta",expectedResult,actualResult);
    }
}
