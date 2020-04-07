package ejercicio1Test;

import ejercicio1.UtilsNumeros;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class PrimosParametersTest {

    private int parameter1;
    private boolean expectedResult;

    public PrimosParametersTest(int parameter1, boolean expectedResult) {
        this.parameter1 = parameter1;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-2, false });
        objects.add(new Object[]{-1, false});
        objects.add(new Object[]{0, false});
        objects.add(new Object[]{1, false});
        objects.add(new Object[]{2, true});
        objects.add(new Object[]{7, true});
        objects.add(new Object[]{8, false});
        objects.add(new Object[]{101, true});
        objects.add(new Object[]{102, false});
        return objects;
    }

    @Test
    public void titleTestParameter() {

        UtilsNumeros utilsNumeros = new UtilsNumeros();
        boolean actualResult=utilsNumeros.esPrimo(this.parameter1);
        Assert.assertEquals("ERROR! "+this.parameter1+" verificacion de primo es fallido",this.expectedResult,actualResult);

    }
}
