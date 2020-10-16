package Day02;

public class Demo02ForDoWhile {
    public static void main(String[] args){
        for (int i = 1;i <= 10;i++){
            System.out.println(i);
        }
        int m = 1;
        do{
            System.out.println(m);
            m++;
        }while (m <= 10 );
        Sum();
        Minute(5,5);
    }
    public static void Sum(){
        int sum = 0;
        for(int num = 1;num <= 100;num++){
            if (num % 2 == 0){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
    public static void Minute(int m,int n){
        for(int i = 1;i <= m;i++){
            for(int j = 1;j<=n;j++){
                System.out.println("这是第"+i+"组，第"+j+"次");
            }
        }
    }
}
