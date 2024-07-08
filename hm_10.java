import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("華氏溫度為:");
        double n1 = scn.nextDouble();
        System.out.println("攝氏溫度為:" + ((n1-32)*5/9));
        scn.close();
    }
}