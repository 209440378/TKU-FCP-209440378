import java.util.Scanner;

public class hm_08 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("輸入姓名");
    String name = scn.next();
    System.out.print("輸入年齡");
    int age = scn.nextInt();
    System.out.print("輸入城市");
    String city = scn.next();
    System.out.println("姓名:"+ name);
    System.out.println("年齡:"+ age);
    System.out.println("城市:"+ city);
    scn.close();
  }
}