package main;


public class Demo03Operator {
    /*
复合赋值运算符：
    +=
    -=
    *=
    /=
    %=  a %= 5  --> a = a%5  %取模  a除以5取余数
 */
    public static void main(String[] args){
        int a = 10;
        a += 5;
        System.out.println(a);
        a %= 5;
        System.out.println(a);
        demo02(10,6);
        demo03(true,false);
        demo04(5,7);
    }
    /*
    比较运算符：
        >
        >=
        <=
        !=
        ==
    比较运算符的结果一定是一个boolean值，成立true，不成了false
     */
    public static void demo02(int a,int b){
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
    /*
    逻辑运算符：
    与（并且） && 全都是true，则为true。否则为false
    或（或者） || 有一个是true，则为true，全为false，才为false
    非（取反） ！ 本来是true，变为false
     */
    public static void demo03(boolean m,boolean n){
        System.out.println(m && n);
        System.out.println(m || n);
        System.out.println(!m);
    }
    /*
    一元运算符：只需要一个数据就可以进行操作的运算符 eg:取反，自增，自减。。
    二元运算符：需要两个数据才可以进行操作的运算符，eg：假发，赋值
    三元运算符：需要三个数据才能进行操作的运算符

    格式：
    数据类型 变量名称 = 判断条件 ？ 表达式A ：表达式B；

    流程：
    首先判断条件是否成立：
        如果成立为true，那么将表达式A的值赋值给左边的变量；
        如果不成立为false，那么将表达式B的值赋值给左边的变量；
    二者选其一
     */
    public static void demo04(int a,int b){
      int max = a >= b ? a : b;
      System.out.println(max);
    }
}
