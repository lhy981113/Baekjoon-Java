import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, min=1000000, max=0;
        n = sc.nextInt();
        int[] a = null;
        a = new int[n];

        for(int i = 0; i<n; i++){
          a[i] = sc.nextInt();
          if(a[i]<min){
            min = a[i];
          }
          if(a[i]>max){
            max = a[i];
          }
        }
        System.out.println(min*max);
    }
}