package ejercicio5mocks;
public class AccountManager {

    private DBTransaccionUtil dbTransaccionUtil = new DBTransaccionUtil();
    private DBConnectionUtil dbConnectionUtil = new DBConnectionUtil();

    public AccountManager(){

    }

    public AccountManager(DBTransaccionUtil dbTransaccionUtil,DBConnectionUtil dbConnectionUtil){
        this.dbTransaccionUtil=dbTransaccionUtil;
        this.dbConnectionUtil=dbConnectionUtil;
    }

    public String getCash(int idClient, int amount){
        String msg;
        if (dbConnectionUtil.checkDBConnection("mysql")){
            Client entity=dbTransaccionUtil.QueryDBConvertResultEntity("SELECT * FROM client WHERE id="+idClient);
            if(amount <= entity.amountAvaiable){
                 msg=dbTransaccionUtil.updateEntity("UPDATE client SET amount = "+(entity.amountAvaiable-amount)+" WHERE id="+idClient)?
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

    public static void main(String []args){
        AccountManager accountManager= new AccountManager();
       System.out.println(accountManager.getCash(123,100));
    }
}
