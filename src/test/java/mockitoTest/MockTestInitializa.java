package mockitoTest;


import mockito.calc.Calc;
import mockito.calc.CalcCloud;
import org.junit.Assert;
;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MockTestInitializa {
    @Mock
    CalcCloud serviceMocked;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
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
}
