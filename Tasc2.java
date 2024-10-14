import java.lang.Math;
import java.util.Scanner;
// задани 2 №12 
public class Tasc2
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean validInput = true; // это для проверки в конце

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        System.out.println("Введіть x в діапазоні від нуля до восьми не включно [0,8): ");
        int x = scanner.nextInt();

        if (x >= 0 && x < 5) {
            result = 2 * x + 7; 
        } 
        else if (x == 5) 
        {
            result = 3 * Math.pow(Math.E, a * x);
        } 
        else if (x > 5 && x < 8) {
            result = Math.log(b * x + a);
        } 
        else {
            System.out.println("Неправильно введене значення Х!");
            validInput = false;
        }

        if (validInput) {
            System.out.println("Відповідь = " + result + "\nПри x = " + x);
        }
        scanner.close();
    }
}