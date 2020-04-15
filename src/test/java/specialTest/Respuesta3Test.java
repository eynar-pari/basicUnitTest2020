package specialTest;
import org.junit.Test;
import special.pregunta3.Pregunta3;

public class Respuesta3Test {

    @Test(timeout = 3500)
    public void timeOut1(){
         Pregunta3.getID(3);
    }

    @Test(expected = Exception.class)
    public void exceptionTest1() throws Exception {
        Pregunta3.validateNumber(-1);
    }

    @Test(expected = NullPointerException.class)
    public void exceptionTest2() throws Exception {
        Pregunta3.validateNumber(0);
    }
}
