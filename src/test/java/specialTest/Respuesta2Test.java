package specialTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import special.pregunta2.Pregunta2;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class Respuesta2Test {

    private int parameter1;
    private String expectedResult;

    public Respuesta2Test(int parameter1, String expectedResult) {
        this.parameter1 = parameter1;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-1,"EDAD NO EXISTE"});
        objects.add(new Object[]{0,"NO RECIBE BONO"});
        objects.add(new Object[]{1,"NO RECIBE BONO"});
        objects.add(new Object[]{32,"NO RECIBE BONO"});
        objects.add(new Object[]{30,"NO RECIBE BONO"});
        objects.add(new Object[]{31,"NO RECIBE BONO"});
        objects.add(new Object[]{64,"RECIBE BONO, EDAD : 64"});
        objects.add(new Object[]{65,"RECIBE BONO, EDAD : 65"});
        objects.add(new Object[]{66,"NO RECIBE BONO, TIENE RENTA"});
        return objects;
    }

    @Test
    public void titleTestParameter() {

        String actualResult= Pregunta2.getBono(this.parameter1);
        Assert.assertEquals("ERROR! el resultado es incorrecto",this.expectedResult,actualResult);
    }
}
