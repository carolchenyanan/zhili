package Day02;

public class Demo01Sequence {
    public static void main(String[] args){
        String name = "李白";
        if (name == "李白"){
            System.out.println("应是天仙狂醉，乱把白云揉碎。");
        }else{
            System.out.println("我有故人抱剑去，斩尽春风未肯归。");
        }
        System.out.println("斯人若彩虹，遇上方知有。");
        for (int i=1;i <= 4;i++){
            Switch(i);
        }
    }
    public static void  Switch(int num){
        switch (num){
            case 1:
                System.out.println("曾有烟雨湿青苔，");
                break;
            case 2:
                System.out.println("曾有凌云舞沧海，");
                break;
            case 3:
                System.out.println("曾有满山佛桑花，");
                break;
            default:
                System.out.println("曾有月影檐上来。");
                break;
        }
    }
}
