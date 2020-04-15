package ejercicio5mockStatic;

import ejercicio5mocks.Client;
import ejercicio5mocks.DBConnectionUtil;
import ejercicio5mocks.DBTransaccionUtil;

public class AccountManager2 {

    public AccountManager2(){

    }

    public String getCash(int idClient, int amount){
        String msg;
        if (DBConnectionUtilStatic.checkDBConnection("mysql")){
            Client entity=DBTransaccionUtilStatic.QueryDBConvertResultEntity("SELECT * FROM client WHERE id="+idClient);
            if(amount <= entity.amountAvaiable){
                 msg=DBTransaccionUtilStatic.updateEntity("UPDATE client SET amount = "+(entity.amountAvaiable-amount)+" WHERE id="+idClient)?
                        "transaccion realizada, saldo actual : "+(entity.amountAvaiable-amount):
                        "no se puedo realizar la transaccion, intentelo mas tarde";
            }
            else{
                msg="transaccion no realizada, la cantidad solicita ["+amount+"] es superior al saldo actual :"+entity.amountAvaiable;

            }
        } else{
          msg= "ERROR! no hay conneccion a la base de datos";
        }
        return msg;
    }
}
