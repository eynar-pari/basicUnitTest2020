// Eynar - Test

package ejercicio2Test;
import ejercicio2.Ejercicio2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class Ejercicio2PositiveTest {

    private int day, year;
    private String month, expectedResult;

    public Ejercicio2PositiveTest(int day, String month, int year, String expectedResult) {
        this.day = day;
        this.month=month;
        this.year=year;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{31,"diciembre",2019,"1 / enero / 2020" });
        objects.add(new Object[]{31,"enero",2020,"1 / febrero / 2020" });
        objects.add(new Object[]{29,"febrero",2020,"1 / marzo / 2020" });
        objects.add(new Object[]{31,"marzo",2020,"1 / abril / 2020" });
        objects.add(new Object[]{30,"abril",2020,"1 / mayo / 2020" });
        objects.add(new Object[]{31,"mayo",2020,"1 / junio / 2020" });
        objects.add(new Object[]{30,"junio",2020,"1 / julio / 2020" });
        objects.add(new Object[]{31,"julio",2020,"1 / agosto / 2020" });
        objects.add(new Object[]{31,"agosto",2020,"1 / septiembre / 2020" });
        objects.add(new Object[]{30,"septiembre",2020,"1 / octubre / 2020" });
        objects.add(new Object[]{31,"octubre",2020,"1 / noviembre / 2020" });
        objects.add(new Object[]{30,"noviembre",2020,"1 / diciembre / 2020" });

        objects.add(new Object[]{12,"enero",2020,"13 / enero / 2020" });
        objects.add(new Object[]{28,"febrero",2020,"29 / febrero / 2020" });
        objects.add(new Object[]{28,"febrero",2019,"1 / marzo / 2019" });
        objects.add(new Object[]{30,"octubre",2020,"31 / octubre / 2020" });

        return objects;
    }

    @Test
    public void titleTestParameter() {
        String actualResult= Ejercicio2.nextDay(this.day,this.month,this.year);
        Assert.assertEquals("ERROR actual result : "+actualResult+" [VS] expected result : "+this.expectedResult,expectedResult,actualResult);
    }
}
