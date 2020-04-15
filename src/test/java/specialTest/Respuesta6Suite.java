package specialTest;

import calculadoraTest.DivTest;
import calculadoraTest.MultTest;
import calculadoraTest.RestaTest;
import calculadoraTest.SumaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value= Suite.class)
@Suite.SuiteClasses(

        {
                Respuesta1Test.class,
                Respuesta2Test.class,
                Respuesta3Test.class,
                Respuesta4Test.class,
                Respuesta5Test.class

        }
)
public class Respuesta6Suite {
}
