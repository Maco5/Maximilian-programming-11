import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int random= (int)(Math.random()*100);
        System.out.println(random);
    }
}