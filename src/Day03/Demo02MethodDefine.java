package Day03;

public class Demo02MethodDefine {
    /*
    定义方法：
    修饰符 返回值类型 方法名称(参数类型 参数名称,...){
        方法体
        return 返回值；
    }
    修饰符 public static
    返回值类型 方法最终产生的数据结果是什么类型
        void:方法没有返回值
    方法名称 小驼峰
     */
    public static void main(String[] args) {

        System.out.println(sum(1,100));
        System.out.println(isSame(6,7));
        printCount(3,"hello world");
        System.out.println(getMax(3,6));
    }
    /*
    求a~b之间整数之和
     */
    public static int sum(int a,int b){
        int result = 0;
        for (int i=a;i<=b;i++){
            result += i;
        }
        return result;
    }
    /*
    判断a,b两个数字是否相同
     */
    public static boolean isSame(int a,int b){
//        boolean same = a == b ? true : false;
        boolean same = a == b;
        return same ;
    }
    /*
    打印num次text
     */
    public static void printCount(int num,String text){
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
//        return 10;错误写法，方法没有返回值，return后面不能写返回值
        return;//没有返回值，只是结束方法的执行而已，可以省略不写
    }
    public static int getMax(int a,int b){
        int max;
//        max = a > b ? a : b;
//        return max;
        if (a>b){
            max = a;
            return max;
        }else{
            max = b;
            return max;
        }


    }
}
