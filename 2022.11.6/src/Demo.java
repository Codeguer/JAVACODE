import com.sun.javaws.Main;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: z'x
 * Date: 2022-11-06
 * Time: 10:33
 */
public class Demo {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b;编译报错,从int转换到byte可能会有损失
        byte c = (byte)(a + b);
        System.out.println(c);
    }
    public static void main14(String[] args) {
        int a = 10; long b = 20;
        //int c = a + b; // 编译出错: a + b==》int + long--> long + long 赋值给int时会丢失数据
        long d = a + b; // 编译成功：a + b==>int + long--->long + long 赋值给long
    }
    public static void main13(String[] args) {
        int a = 10; long b = 100L;
        b = a;	// int-->long，数据范围由小到大，隐式转换
        a = (int)b; // long-->int, 数据范围由大到小，需要强转，否则编译失败

        float f = 3.14F; double d = 5.12;
        d = f;	// ﬂoat-->double，数据范围由小到大，隐式转换
        f = (float)d; // double-->ﬂoat, 数据范围由大到小，需要强转，否则编译失败

        a = (int)d; // int没有double表示的数据范围大，需要强转，小数点之后全部丢弃

        byte b1 = 100;	// 100默认为int，没有超过byte范围，隐式转换
        byte b2 = (byte)257; // 257默认为int，超过byte范围，需要显示转换，否则报错
    }
    public static void main12(String[] args) {
        System.out.println(1024); // 整型默认情况下是int
        System.out.println(3.14); // 浮点型默认情况下是double
        int a = 100;
        long b = 10L;
        b = a; // a和b都是整形，a的范围小，b的范围大，当将a赋值给b时，编译器会自动将a提升为long类型，然后赋值
        // a = b; // 编译报错，long的范围比int范围大，会有数据丢失，不安全

        float f = 3.14F;
        double d = 5.12;
        d = f; // 编译器会将f转换为double，然后进行赋值
        //f = d; // double表示数据范围大，直接将ﬂoat交给double会有数据丢失，不安全
        byte b1 = 100; // 编译通过，100没有超过byte的范围，编译器隐式将100转换为byte
        // byte b2 = 257; // 编译失败，257超过了byte的数据范围，有数据丢失
    }
    public static void main11(String[] args) {
        boolean a=true;
        System.out.println(a);
    }
    public static void main10(String[] args) {
        char a=65;
        char b='中';
        System.out.println(a);//a以字符形式显示
        System.out.println(b);
    }
    public static void main9(String[] args) {
        float a=3.14f;//不加f或F会报错
        System.out.println(a);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
    public static void main8(String[] args) {
        double a=1.0;
        double b=2.0;
        System.out.println(a/b);//0.5
        double num=1.1;
        System.out.println(num*num);//1.2100000000000002
        //小数其实没有精确的 只能说精确到某一位上
    }
    public static void main7(String[] args) {
        long a=263L;
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
    public static void main6(String[] args) {
        short a=215;
        System.out.println(a);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
    public static void main5(String[] args) {
        byte a=65;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
    public static void main4(String[] args) {
        int a = 10;
        long b = 100; // long定义的长整型变量
        long c = 100L; // 为了区分int和long类型，一般建议：long类型变量的初始值之后加L或者l
        long d = 1000l; // 一般更加以加大写L，因为小写l与1不好区分
        // long型变量所能表示的范围：这个数据范围远超过 int 的表示范围. 足够绝大部分的工程场景使用.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
    public static void main3(String[] args) {
        // 方式一：在定义时给出初始值
        int a = 10;
        System.out.println(a);
        // 方式二：在定义时没有给初始值，但使用前必须设置初值
        int b; b = 10;
        System.out.println(b);
        // 使用方式二定义后，在使用前如果没有赋值，则编译期间会报错
        int c;
        //System.out.println(c); 这句直接报错
        c = 100;
        // int 型 变 量 所 能 表 示 的 范 围 ：
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // 注意：在定义int性变量时，所赋值不能超过int的范围
        //int d = 12345678901234; // 编译时报错，初值超过了int的范围
    }
    public static void main2(String[] args) {
        int a =10; // 定义整形变量a，a是变量名也称为标识符，该变量中放置的值为10
        double d = 3.14;
        char c = 'A';
        boolean b = true;
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        a = 100;// a是变量，a中的值是可以修改的
        // 注意：= 在java中表示赋值，即将100交给a，a中保存的值就是100
        System.out.println(a);
        // 注意：在一行可以定义多个相同类型的变量
        int a1 = 10, a2 = 20, a3 = 30;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
    public static void main1(String[] args) {
        System.out.println("字符串常量：Hello World");
        System.out.println("字符常量：'A'");
        System.out.println("整型常量：100");
        System.out.println("浮点型常量：3.14");
        System.out.println("布尔常量：true");
        System.out.println("空常量：null");
    }
}
