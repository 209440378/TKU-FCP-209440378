public class ch5_11 {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++){
            if(i%3==0)
                continue;
            System.out.printf("%3d",i);
        }
    }
}
