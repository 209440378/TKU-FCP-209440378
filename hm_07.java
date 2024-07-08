import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float area;

        System.out.print("輸入半徑");
        int n1 = scn.nextInt();
        area = (float) (Math.PI * n1 * n1);
        System.out.println("面積為:" + area);
        scn.close();
    }
}