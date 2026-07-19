class Calculater{
public int add(int a,int b){
    return a+b;
}
public int mult(int a,int b){
    return a*b;
}
}
public class CalculaterTest {
    public static void main(String[] args) {
        Calculater c=new Calculater();
        System.out.println("result:"+c.add(10,20));
        System.out.println("result"+c.mult(10,20));
    }
}
