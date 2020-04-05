package mockitoTest;

import mockito.calc.Calc;
import mockito.calc.CalcCloud;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MockTest {
    CalcCloud serviceMocked = Mockito.mock(CalcCloud.class);
    @Test
    public void testMocked(){
        Mockito.when(serviceMocked.mult(1,1)).thenReturn(1);
        Mockito.when(serviceMocked.mult(1,2)).thenReturn(2);
        Mockito.when(serviceMocked.mult(2,3)).thenReturn(6);

        Calc calc = new Calc(serviceMocked);
        int expectedResult=6;
        int actualResult=calc.fact(3);
        Assert.assertEquals("ERROR en factorial",expectedResult,actualResult);
    }

    @Test
    public void testMockedWithVerificartion(){
        Mockito.when(serviceMocked.mult(1,1)).thenReturn(1);
        Mockito.when(serviceMocked.mult(1,2)).thenReturn(2);
        Mockito.when(serviceMocked.mult(2,3)).thenReturn(6);

        Calc calc = new Calc(serviceMocked);
        int expectedResult=6;
        int actualResult=calc.fact(3);
        Assert.assertEquals("ERROR en factorial",expectedResult,actualResult);

        Mockito.verify(serviceMocked).mult(1,1);
        Mockito.verify(serviceMocked).mult(1,2);
        Mockito.verify(serviceMocked).mult(2,3);
    }
}
