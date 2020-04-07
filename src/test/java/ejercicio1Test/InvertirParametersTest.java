package ejercicio1Test;

import ejercicio1.UtilsNumeros;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class InvertirParametersTest {

    private int parameter1, expectedResult;

    public InvertirParametersTest(int parameter1, int expectedResult) {
        this.parameter1 = parameter1;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-123, -321});
        objects.add(new Object[]{0, 0});
        objects.add(new Object[]{1, 1});
        objects.add(new Object[]{123, 321});
        objects.add(new Object[]{100, 001});
        objects.add(new Object[]{001, 1});
        objects.add(new Object[]{1001, 1001});
        return objects;
    }

    @Test
    public void titleTestParameter() {
        UtilsNumeros utilsNumeros = new UtilsNumeros();
        int actualResult= utilsNumeros.invertirNumero(this.parameter1);
        Assert.assertEquals("ERROR actual result : "+this.parameter1+" [VS] expected result : "+this.expectedResult,expectedResult,actualResult);
    }
}
