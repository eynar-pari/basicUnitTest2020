package calculadoraTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value= Suite.class)
@Suite.SuiteClasses(

        {
         DivTest.class,
         MultTest.class,
         RestaTest.class,
         SumaTest.class

        }
)
public class SuiteCalculadora {
}
