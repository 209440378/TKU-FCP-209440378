public class ch3_9_1 {
  public static void main(String[] args) {
    char c1 = 'G';
    char c2 = 71;
    char c3 = '\u0047';
    int uni = '好';
    int uni1 = '你';
    char ch1 = '\u597D';
    char ch2 = '\u4F60';

    System.out.println("c1=" + c1 + ", c2=" + c2 + " ,c3=" + c3);
    System.out.println("uni=" + uni);
    System.out.println((int) '好');
    System.out.println("uni1=" + uni1);
    System.out.print(ch2+""+ch1);
  }
}