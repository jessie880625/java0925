public class cylinder {
    public static void main(String[] arg){
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        final double PI = 3.1415926;


        float r= sc.nextFloat();
        float h= sc.nextFloat();

        System.out.println(PI*Math.pow(r,2)*h);
    }
}
