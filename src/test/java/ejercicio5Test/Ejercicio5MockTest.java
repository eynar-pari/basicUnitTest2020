package ejercicio5Test;

import ejercicio5mocks.AccountManager;
import ejercicio5mocks.Client;
import ejercicio5mocks.DBConnectionUtil;
import ejercicio5mocks.DBTransaccionUtil;
import mockito.calc.Calc;
import mockito.calc.CalcCloud;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.nio.channels.AcceptPendingException;

public class Ejercicio5MockTest {

    DBConnectionUtil dbConnectionUtilMocked= Mockito.mock(DBConnectionUtil.class);
    DBTransaccionUtil dbTransaccionUtilMocked=Mockito.mock(DBTransaccionUtil.class);

    @Test
    public void testMocked(){

        Mockito.when(dbConnectionUtilMocked.checkDBConnection("mysql")).thenReturn(true);
        Mockito.when(dbTransaccionUtilMocked.QueryDBConvertResultEntity("SELECT * FROM client WHERE id=9")).thenReturn(new Client(9,"TEST",1000));
        Mockito.when(dbTransaccionUtilMocked.updateEntity("UPDATE client SET amount = 600 WHERE id=9")).thenReturn(true);

        // objeto original

        AccountManager accountManager = new AccountManager(dbTransaccionUtilMocked,dbConnectionUtilMocked);

        String expectedResult="transaccion realizada, saldo actual : 600";
        String actualResult=accountManager.getCash(9,400);
        Assert.assertEquals("ERROR",expectedResult,actualResult);
    }

}
