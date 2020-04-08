package ejercicio3mocks;

public class Nota {

    ValidatorUtil util = new ValidatorUtil();

    public Nota(){

    }

    public Nota(ValidatorUtil util){
        this.util=util;
    }

    public String reconocimiento(int nota){
        String msg="Regular Rendimiento";
        if (util.isValid(nota,1,100)){

            if (nota >= 80 && nota < 90){
             msg="Bueno ";
            }
            if (nota >= 90 && nota < 100){
                msg="Muy Bueno ";
            }
            if (nota == 100){
                msg="Excelente ";
            }

        }
        return msg + nota;
    }
}
