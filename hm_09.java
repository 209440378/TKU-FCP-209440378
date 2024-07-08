import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("輸入長:");
        int n1 = scn.nextInt();
        System.out.print("輸入寬:");
        int n2 = scn.nextInt();
        System.out.println("面積:" + (n1*n2));
        scn.close();
    }
}