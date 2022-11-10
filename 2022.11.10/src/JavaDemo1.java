import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: z'x
 * Date: 2022-11-10
 * Time: 17:44
 */
public class JavaDemo1 {
    public static void main(String[] args) {

    }
    public static void main(String[] args) {
        //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数
        //本身，如： 153＝1^3＋5^3＋3^3 ，则153是一个“水仙花数”。)
        for (int i = 100; i < 1000; i++) {
            int one,two,three=i;
            one=three%10;
            three/=10;
            two=three%10;
            three/=10;
            if((one*one*one+two*two*two+three*three*three)==i){
                System.out.println(i);
            }
        }
    }
    public static void main10(String[] args) {
        //输出乘法口诀表
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println("");
        }
    }
    public static void main9(String[] args) {
        //根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if(age<=18){
            System.out.println("少年");
        }else if(age<=28){
            System.out.println("青年");
        }else if(age<=55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
    public static void main8(String[] args) {
        //求2个整数的最大公约数
        int num1,num2;
        Scanner scan=new Scanner(System.in);
        num1=scan.nextInt();
        num2=scan.nextInt();
        if(num1>num2){
            int a=num1;
            num1=num2;
            num2=a;
        }
        for (int i = num1; i >0 ; i--) {
            if((num2%i==0)&&(num1%i==0)){
                System.out.println(num1+"与"+num2+"的最大公约数是："+i);
                break;
            }
        }
    }
    public static void main7(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        int sum=0;
        Scanner scan=new Scanner((System.in));
        int num=scan.nextInt();
        while(num!=0){
            sum++;
            num&=(num-1);
        }
        System.out.println(sum);
    }
    public static void main6(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        int sum=0;
        Scanner scan=new Scanner((System.in));
        int num=scan.nextInt();
        while(num!=0){
            if(num%2==1){
                sum++;
            }
            num/=2;
        }
        System.out.println(sum);
    }
    public static void main5(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        int sum=0;
        Scanner scan=new Scanner((System.in));
        int num=scan.nextInt();
        for (int i = 0; i < 32; i++) {
            if((num&(1<<i))!=0){
                sum++;
            }
        }
        System.out.println(sum);
        scan.close();
    }
    public static void main4(String[] args) {
        //给定一个数字，判定一个数字是否是素数
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        if(i<=1){
            System.out.println(i+"不是素数");
        } else if(i==2||i==3){
            System.out.println(i+"是素数");
        } else{
            for (int j = 2; j < i; j++) {
                if(i%j==0) {
                    System.out.println(i+"不是素数");
                    break;
                }
            }
            System.out.println(i+"是素数");
        }
        scan.close();
    }
    public static void main3(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i <=2000 ; i+=4) {
            if((i%4==0&&i%100!=0)||(i%400==0)) System.out.println(i);
        }
    }
    public static void main2(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int  sum=0;
        for (int i = 1; i <=100 ; i++) {
            for (int j = i; j >0; j/=10) {
                if(j%10==9)sum++;
            }
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        //打印1~100之间的所有素数
        System.out.println(2);
        for (int i = 3; i <=100; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0)break;
                if(j==i-1) System.out.println(i);
            }
        }
    }
}
