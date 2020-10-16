package main;

/*
方法定义格式：
public static void 方法名称(){
    方法体
}

方法名 命名规则 小驼峰
方法调用： 方法名称();
 */
public class DemoMethod {
    public static void main(String[] args){
        first();
        second();
        third();
    }
    public static void first(){
        System.out.println("早知惊鸿一场");
    }
    public static void second(){
        System.out.println("何必情深一往");
    }
    public static void third(){
        System.out.println("昨日人去楼空泪微凉");
    }
}
