/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: z'x
 * Date: 2022-11-07
 * Time: 19:13
 */
public class JavaDemo {
    public static void main(String[] args) {
        boolean flg = (true == true) ? (true == true) ?  false : true : true;
        System.out.println(flg);//false
        int ret=10>5?3:5<8?25:40;
        System.out.println(ret);//3
    }
    public static void main11(String[] args) {
        int a = -1;//1000 0001 ---> 补码： 1111 1111
        System.out.println(a>>1);//补码： 1111 1111
        System.out.println(a >>> 1);//补码：0111 1111
    }
    public static void main10(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(!(a==1));
        System.out.println(a == 1 ||  (1/0)==0);//短路或
        System.out.println(a == 1 && b == 2);
        System.out.println(a == 2 && b == 2);
        System.out.println(a == 2 && (1/0)==0);//短路与

        // & 符号 ，如果左右两边都是布尔类型 那么也相当于逻辑运算,但没有短路功能
        System.out.println(a == 1 & b == 2);
        //此时和刚刚的区别 在于这里不能够进行短路求值了
        //System.out.println(a == 2 & (1/0)==0);会抛除0异常
    }
    public static void main9(String[] args) {
        System.out.println(1 < 5);
        System.out.println(1 <= 5);
        System.out.println(1 > 5);
        System.out.println(1 >= 5);
        System.out.println(1 != 5);
        System.out.println(1 == 5);
        int a = 10;
        //System.out.println(3 < a < 100);不要这样写，会报错
    }
    public static void main8(String[] args) {
        short a = 10;
        a++;//直接写a=a+1;会报错

        int i = 10;
        i = i++;//查看java汇编
        System.out.println(i);//i结果为10
    }
    public static void main7(String[] args) {
        int a = 10;
        a += 1; //理解为 = a + 1
        System.out.println(a);

        short sh = 12;
        //sh = sh + 2;直接这样写会报错
        sh += 2;//理解为自动帮我们进行了类型的转换
        System.out.println(sh);
    }
    public static void main6(String[] args) {
        System.out.println(10%3);//1
        System.out.println(10%-3);//1
        System.out.println(-10%3);//-1
        System.out.println(-10%-3);//-1
        System.out.println(11.5%2);//1.5
    }
    public static void main5(String[] args) {
        //int / int 结果还是int类型，而且会向下取整
        System.out.println(5/2);//2
        System.out.println((float)5/2);//2.5
        System.out.println(5/(float)2);//2.5
        System.out.println((float)(5/2));//2.0
        // 小数最少也会给个小数点给你，因此结果不是2，而是2.0
        System.out.println(5*1.0/2);//2.5
    }
    public static void main4(String[] args) {
        String s="123";
        int ret1=Integer.valueOf(s);
        System.out.println(ret1+1);//124
        float ret2=Float.valueOf("3.14");
        System.out.println(ret2+1);//4.14
    }
    public static void main3(String[] args) {
        //通过拼接
        int a=10;
        String s=""+a;
        //通过点号 来调用类当中的方法
        String ss=String.valueOf(a);
        byte b=20;
        String sss=String.valueOf(b);
        System.out.println(s);
        System.out.println(ss);
        System.out.println(sss);
    }
    public static void main2(String[] args) {
        //字符串中，+表示拼接
        String s1="Hello ";
        String s2="World";
        System.out.println(s1+s2);//输出Hello World
        //字符串与其它类型进行拼接
        int a=10,b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+(a+b));
        System.out.println("a*100+b="+a+b);
        System.out.println(a+b+"是a+b的和");
    }
    public static void main1(String[] args) {
        String s="Hello World";//s的类型是字符串类型
    }
}

