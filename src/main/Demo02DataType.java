package Day01;
/*
强制类型转换
1、特点：代码需要进行特殊的格式处理，不能自动完成
2、格式：范围小的类型 范围小的类型名 = （范围小的类型）原本范围大的数据
注意事项：
1、强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
 */
public class Demo02DataType {
    public static void main(String[] args){
//        左边是int，右边是long，取值范围从大到小，不能自动类型转换
        int num =(int)100L;
        System.out.println(num);
        int num2 = (int)10000000000L;
        System.out.println(num2);
    }
}
