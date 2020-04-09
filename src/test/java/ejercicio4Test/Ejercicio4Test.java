package ejercicio4Test;

import ejercicio4mocksStatic.Nota2;
import ejercicio4mocksStatic.ValidatorUtilStatic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ValidatorUtilStatic.class)
public class Ejercicio4Test {

    @Test
    public void verifyTheReconocimiento(){
        PowerMockito.mockStatic(ValidatorUtilStatic.class);
        Mockito.when(ValidatorUtilStatic.isValid(80,1,100)).thenReturn(true);

        Nota2 nota2 = new Nota2();

        String expectedResult="Bueno 80";
        String actualResult=nota2.reconocimiento(80);
        Assert.assertEquals("ERROR!",expectedResult,actualResult);

    }

}
