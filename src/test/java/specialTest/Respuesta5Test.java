package specialTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import powermock.CalcCloudStatic;
import special.pregunta_4_5.PreguntaMock;
import special.pregunta_4_5.PreguntaMockStatic;
import special.pregunta_4_5.Util;
import special.pregunta_4_5.UtilStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilStatic.class)
public class Respuesta5Test {

    @Test
    public void testMockedStatic(){
        PowerMockito.mockStatic(UtilStatic.class);
        Mockito.when(UtilStatic.getTypeMoney("Bolivianos","Dolar")).thenReturn(7);
        PreguntaMockStatic preguntaMock = new PreguntaMockStatic();
        String  expectedResult=" tipo de cambio a [Dolar] es : 10";
        String actualResult=preguntaMock.convertBolivianosToOther(70,"Dolar");
        Assert.assertEquals("ERROR en tipo de cambio",expectedResult,actualResult);
    }
}
