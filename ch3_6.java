public class ch3_4 {
  public static void main(String[] args) {
    int i = java.lang.Integer.MAX_VALUE; // 將I設為int型別的最大值

    System.out.println("i=" + i);
    System.out.println("i=" + (i + 1)); // 溢位
    System.out.println("i+1=" + (i + 1L)); // 自動型別轉換
    System.out.println("i+2=" + ((long) i + 2)); // 強制型別轉換

  }
}