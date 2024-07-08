import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("輸入價格一:");
        int n1 = scn.nextInt();
        System.out.print("輸入價格二:");
        int n2 = scn.nextInt();
        System.out.print("輸入價格三:");
        int n3 = scn.nextInt();
        System.out.println("總價:" + (n1+n2+n3));
        scn.close();
    }
}