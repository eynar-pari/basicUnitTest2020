package powermock;
public class Calc2 {
    public Calc2(){}
    public int fact(int n){
        int fact=1;
        for (int i = 1; i <= n ; i++) {
            fact=CalcCloudStatic.mult(fact,i);
        }
        return fact;
    }
}
