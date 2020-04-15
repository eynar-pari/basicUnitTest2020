package specialTest;

import mockito.calc.Calc;
import mockito.calc.CalcCloud;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import special.pregunta_4_5.PreguntaMock;
import special.pregunta_4_5.Util;

public class Respuesta4Test {

     Util serviceMocked = Mockito.mock(Util.class);

    @Test
    public void testMocked(){
        Mockito.when(serviceMocked.getTypeMoney("Bolivianos","Dolar")).thenReturn(7);
        PreguntaMock preguntaMock = new PreguntaMock(serviceMocked);
        String  expectedResult=" tipo de cambio a [Dolar] es : 10";
        String actualResult=preguntaMock.convertBolivianosToOther(70,"Dolar");
        Assert.assertEquals("ERROR en tipo de cambio",expectedResult,actualResult);
        Mockito.verify(serviceMocked).getTypeMoney("Bolivianos","Dolar");
    }
}
