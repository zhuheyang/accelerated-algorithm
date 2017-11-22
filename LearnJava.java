// 导入java.util中的ArrayList类
import java.util.ArrayList;
// 导入java.security包中的所有类
import java.security.*;

// 每个Java文件都包含一个public类,其类名必须与文件名一致
public class LearnJava {
    // 每个程序都需有一个main函数为入口
    public static void main (String[] args) {
        System.out.println(
                "Integer: " + 10 +
                        "double: " + 3.14 +
                        "boolean: " + true);
        System.out.print("Hello ");
        System.out.print("World");
        byte fooByte = 100;
        short fooShort = 10000;
        int fooInt = 1;
        // L可用于表示数字为长整型的,其余则默认为整型的
        long fooLong = 100000L;
        // f用于表示一个数字为浮点型的,否则被当做双精度浮点型
        float fooFloat = 234.5f;
        double fooDouble = 123.4;
        boolean fooBoolean = true;
        boolean barBoolean = false;
        // 字符类型-16位unicode编码字符
        char fooChar = 'A';
        //使用final可使一常量不可更改
        final int HOURS_I_WORK_PER_WEEK = 9001;
        String fooString = "My String Is Here!";
        String barString = "Printing on a new line?\nNo problem!";
        String bazString = "Do you want to add a tab?\tNo problem!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        // 数组
        // <数据类型> [] <变量名> = new <数据类型>[<数组大小>];
        int [] intArray = new int[10];
        String [] stringArray = new String[1];
        boolean [] booleanArray = new boolean[100];

        // 声明及初始化数组的第二种形式

        // 其他数据类型:
        // ArrayLists: 类似数组,但功能更多且大小可改变
        // LinkedLists, Maps, HashMaps

        // 操作符

        // 算数运算

        // 取余

        // 比较操作符

        // 位操作符
        // ~ 取反,求反码, << 带符号左移, >> 带符号右移, >>> 无符号右移, & 和, ^ 异或, | 相容或

        // 自增

        // 控制结构

        // If语句

        // While循环

        // Do While循环

        // For循环

        // Switch Case语句

        // 类型转换
        Integer.parseInt("123");
        Integer.toString(123);
        // 其它的数据也可相互转换: Double, Long, String

        // 类与函数
        System.out.println("\n->Classes & Functions");

        Bicycle trek = new Bicycle();

        trek.speedUp(3);
        trek.serCadence(100);

        System.out.println("trek info: " + trek.toString());
    } // main方法结束
} // LearnJava类结束

// 我们可以将其它非public类加入到.java文件中
// 类定义语法: <public/private/protected> class <类名>{
//                  // 成员变量,构造函数,函数
//                  // Java中函数被称作方法
//              }

class Bicycle {

    public int cadence;
    private int speed;
    protected int gear;
    String name;


    // 默认构造函数
    public Bicycle() {
        gear = 1;
        cadence = 50;
        speed = 5;
        name = "Bontrager";
    }

    // 带参数构造函数

    // 函数语法
    // <public/private/protected> <返回值类型> <函数名称>(<参数列表>)
    // Java中常用getter,setter来对成员变量进行操作
    // 方法声明的语法:
    // <作用域> <返回值类型> <方法名>(<参数列表>)

    // 使用@注释来表示需要重载的方法

}
