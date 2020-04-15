package special.pregunta_4_5;

public class PreguntaMockStatic {

    public PreguntaMockStatic(){}


    /**
     * metodo para cambiar Bolivianos a otra moneda
     * @param amount
     * @param typeMoney
     * @return
     */
    public String convertBolivianosToOther(int amount, String typeMoney){
          String msg;
          if (amount > 0){
              // X Bolivianos = 1 Dolars
              int tipoDeCambio = UtilStatic.getTypeMoney("Bolivianos",typeMoney);
              msg=" tipo de cambio a ["+typeMoney +"] es : "+ amount/tipoDeCambio;
          }else{
              msg ="ERROR ! la cantidad es incorrecta";
          }
          return msg;
    }
}
