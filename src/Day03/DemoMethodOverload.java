package Day03;

/*
方法的重载（overload）
多个方法的名称一样，但是参数列表不一样。

方法重载与下列因素相关：
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同

方法重载与下列因素无关：
1、与参数名称无关
2、与返回值类型无关
 */

public class DemoMethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(1,2,3));
        System.out.println(sum(3,5,7,0));
    }
    public static int sum(int a ,int b){
        int sum = a + b;
        return sum ;
    }
    //    方法重载与参数类型有关
    public static int sum(int a,double b){
        return a+(int)b;
    }
    //    方法重载与参数多类型顺序不同有关
    public static int sum(double a,int b){
        return (int)a+b;
    }
    //    错误写法，方法重载与参数名称无关
//    public static int sum(double x,int y){
//        return (int)a+b;
//    }
    //    错误写法方法重载与返回值类型无关
//    public static double sum(double a,int b){
//        return a+(double) b;
//    }
    public static int sum(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static int sum(int a,int b,int c,int d){
        int sum = a+b+c+d;
        return sum;
    }

}
