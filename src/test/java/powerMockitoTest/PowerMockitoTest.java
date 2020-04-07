package powerMockitoTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import powermock.Calc2;
import powermock.CalcCloudStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CalcCloudStatic.class)
public class PowerMockitoTest {

    @Test
    public void testing(){
        PowerMockito.mockStatic(CalcCloudStatic.class);
        Mockito.when(CalcCloudStatic.mult(1,1)).thenReturn(1);
        Mockito.when(CalcCloudStatic.mult(1,2)).thenReturn(2);
        Mockito.when(CalcCloudStatic.mult(2,3)).thenReturn(6);
        Calc2 calc = new Calc2();
        int expectedResult=6;
        int actualResult=calc.fact(3);
        Assert.assertEquals("ERROR en factorial",expectedResult,actualResult);
    }
}
