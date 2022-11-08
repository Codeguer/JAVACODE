import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: z'x
 * Date: 2022-11-08
 * Time: 18:56
 */
public class JavaDemo {
    public static void main(String[] args) {
        Random random = new Random(123);//指定随机种子
        int randNum = random.nextInt(100);//[0,100)
        System.out.println(randNum);
    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();//默认随机种子是系统时间
        int randNum = random.nextInt(100);//[0,100)
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num > randNum) {
                System.out.println("猜大了！");
            }else if(num == randNum) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜小了！");
            }
        }
        scan.close();
    }
    public static void main9(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextInt()){
            int n=scan.nextInt();
            System.out.println("n="+n);
        }
    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int n = scan.nextInt();//2
        System.out.println(n);

        //此时  年龄输完之后  回车 会被下边读取到
        System.out.println("请输入姓名：");
        String name = scan.nextLine();
        System.out.println(name);
    }
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);//1
        System.out.println("请输入姓名：");//hello world
        // 遇到空格就结束了
        String name = scan.next();
        System.out.println(name);//hello

        String name2 = scan.next();
        System.out.println(name2);//world
        scan.close();
    }
    public static void main6(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name=scan.nextLine();//获取一行字符
        System.out.println("请输入您的年龄：");
        int age=scan.nextInt();
        System.out.println("请输入您的工资：");
        float salary=scan.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        scan.close();
    }
    public static void main5(String[] args) {
        System.out.println("输出且换行");
        System.out.print("输出且不换行");
        System.out.printf("%s\n","格式化输出！和C语言一样！");
    }
    public static void main4(String[] args) {
        /*for (int i = 0; i <3 ; i++) {

        }
        for (int i = 0; ; i++) {

        }
        for (int i = 0;  ; ) {

        }
        for (; ; ) {

        }*/
    }
    public static void main3(String[] args) {
        double num=1.1;
        /*switch(num) {
            case 1.0:
                System.out.println("hehe");
                break;
            case 2.0:
                System.out.println("haha");
                break;
        }*/
    }
    public static void main2(String[] args) {
        int i=10;
        switch(i){
            case 8:
                System.out.println("i==8");
                break;
            case 9:
                System.out.println("i==9");
                break;
            case 10:
                System.out.println("i==10");
                break;
            default:
                System.out.println("i为其它值");
                break;
        }
    }
    public static void main1(String[] args) {
        int a=10;
        if(a==10){
            System.out.println("a==10");
        }

        int b=20;
        if(b==20){
            System.out.println("b==20");
        }else {
            System.out.println("b!=20");
        }

        int c=30;
        if(c==30){
            System.out.println("c==30");
        }else if(c==40){
            System.out.println("c==40");
        }else {
            System.out.println("c为其它值");
        }
    }
}
