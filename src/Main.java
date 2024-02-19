import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        int e=1;
        int n,sum=0;
        n= sc.nextInt();
        System.out.print(s+" "+e);
        for(int i=0;i<n;i++){
            sum =s+e;
            s=e;
            e=sum;
            System.out.print(" "+sum+" ");

        }
        }
}