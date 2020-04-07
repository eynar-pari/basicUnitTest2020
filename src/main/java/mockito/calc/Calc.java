package mockito.calc;

public class Calc {
    private CalcCloud service = new CalcCloud();

    public Calc(){}

    public Calc (CalcCloud service){
        this.service=service;
    }
    public int fact(int n){
        int fact=1;
        for (int i = 1; i <= n ; i++) {
            fact=service.mult(fact,i);
        }
        return fact;
    }

}
