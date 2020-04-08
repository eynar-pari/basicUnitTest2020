package ejercicio3Test;

import ejercicio3mocks.Nota;
import ejercicio3mocks.ValidatorUtil;
import mockito.calc.Calc;
import mockito.calc.CalcCloud;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class Ejercicio3Test {

    ValidatorUtil utilMocked = Mockito.mock(ValidatorUtil.class);
    @Test
    public void testMocked(){
        Mockito.when(utilMocked.isValid(80,1,100)).thenReturn(true);
        Nota nota = new Nota(utilMocked);
        String expectedResult="Bueno 80";
        String  actualResult=nota.reconocimiento(80);
        Assert.assertEquals("ERROR!! el mensaje es incorrecto",expectedResult,actualResult);
    }

}
