package ejercicio6Test;

import ejercicio5mockStatic.AccountManager2;
import ejercicio5mockStatic.DBConnectionUtilStatic;
import ejercicio5mockStatic.DBTransaccionUtilStatic;
import ejercicio5mocks.AccountManager;
import ejercicio5mocks.Client;
import ejercicio5mocks.DBConnectionUtil;
import ejercicio5mocks.DBTransaccionUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import powermock.CalcCloudStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DBTransaccionUtilStatic.class, DBConnectionUtilStatic.class})
public class Ejercicio6MockTest {


    @Test
    public void testMocked(){
        PowerMockito.mockStatic(DBConnectionUtilStatic.class);
        Mockito.when(DBConnectionUtilStatic.checkDBConnection("mysql")).thenReturn(true);

        PowerMockito.mockStatic(DBTransaccionUtilStatic.class);
        Mockito.when(DBTransaccionUtilStatic.QueryDBConvertResultEntity("SELECT * FROM client WHERE id=9")).thenReturn(new Client(9,"TEST",1000));
        Mockito.when(DBTransaccionUtilStatic.updateEntity("UPDATE client SET amount = 600 WHERE id=9")).thenReturn(true);

        // objeto original

        AccountManager2 accountManager = new AccountManager2();

        String expectedResult="transaccion realizada, saldo actual : 600";
        String actualResult=accountManager.getCash(9,400);
        Assert.assertEquals("ERROR",expectedResult,actualResult);
    }

}
