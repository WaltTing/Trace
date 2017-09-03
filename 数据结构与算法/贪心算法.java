package scnu;

import java.util.Scanner;

public class RMB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int money[] = new int[]{100,50,20,10,5,2,1};

        for(int i=0; i<7; i++){
            if(n/money[i] > 0) {
                count += n / money[i];
                System.out.println(n/money[i]+"张"+money[i]+"面值");
                n = n % money[i];
            }
        }

        System.out.println("总共"+count+"张");

    }
}
