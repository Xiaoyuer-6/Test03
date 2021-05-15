import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-09
 * Time: 14:45
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1 =in.nextLine();
            String str2 = in.nextLine();
            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();
            for(int i = 0;i<ch1.length;i++){
                for (int j = 0; j <ch2.length ; j++) {
                 //ch1.
                }
            }
            //System.out.println(a + b);
        }
    }
}
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int  n = in.nextInt();
//            System.out.println(Finbonacci(n));
//        }
//    }
//    public static int Finbonacci(int n){
//        if(n<=2){
//            return 1;
//
//        }
//        return Finbonacci(n-1)+Finbonacci(n-2);
//    }
//}
   //public String str = "6";

//    public static void main(String[] args) {
//        Integer t1 = 101;
//        int t2= 101;
//        Integer t3 = Integer.valueOf(101);
//
//        Integer t4 = new Integer(101);
//        System.out.println(t4==t3);
//      TestDemo t1 = new TestDemo();
//      t1.change(t1.str);
//        System.out.println(t1.str);
//        t1.x++;
//        TestDemo t2 = new TestDemo();
//        t2.x++;
//        t1 = new TestDemo();
//        t1.x++;
//        TestDemo.x--;
//        System.out.println(x);
//    }
//    public void change(String str){
//        str = "10";
//    }

