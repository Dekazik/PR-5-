import java.lang.Math;
// 1 задание №12  

public class Tasc1 {
    public static final double a = 3.457;
    public static final double b = 3.1;
    public static final double c = 2;
   
    public static void main(String[] args) {
        double x = Math.pow((a - 5), 2) * Math.pow(Math.pow((b+1),2), 1/3) + Math.log(a); // ln = log?
        double y = a * Math.pow(Math.E, -b*c) * Math.sin(c);

        System.out.println("Значення виразу у = " + x);
        System.out.println("Значення виразу у = " + y);
    }
}