import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class TestingBasicParameters {

    private int parameter1, parameter2,expectedResult;

    public TestingBasicParameters(int parameter1, int parameter2, int expectedResult) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{1, 2, 3});
        objects.add(new Object[]{2, 2, 4});
        objects.add(new Object[]{3, 2, 5});
        return objects;
    }

    @Test
    public void titleTestParameter() {
        System.out.println("parameter1 : " + this.parameter1);
        System.out.println("parameter1 : " + this.parameter2);
        System.out.println("parameter1 : " + this.expectedResult);
    }
}
