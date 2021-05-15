import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-11
 * Time: 13:58
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = new String();
        //String [] s1= new String[str1];
        char [] ch1=str1.toCharArray();
        char []  ch2 =str2.toCharArray();
        int size = 0;
        int maxsize = 0;
        char [] ch3 = str3.toCharArray();
        for (int i = 0; i <ch1.length ; i++) {
            for (int j = 0; j <ch2.length ; j++) {
                if(ch1 [i] == ch2[j]){
                    ch3 [i] = ch1[i];
                    size++;
                    maxsize =Math.max(size,maxsize) ;
                }else {
                    size=0;
                }
            }
        }
        System.out.println(maxsize);

    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (!sc.hasNext("0")){
//            int n = sc.nextInt();
//            int count = 0;
//            while(n/3>0){
//                count+=n/3;
//                n=n/3+n%3;
//            }
//            if(n%3==2){
//                count++;
//            }
//            System.out.println(count);
//            }
//        }
//    }
//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(!sc.hasNext("0")){
//            int n = sc.nextInt();
//            int count = 0;
//            while(n/3>0){
//                count+=n/3;
//                n=n/3+n%3;
//                if(n==2){
//                    n=n+1;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}
