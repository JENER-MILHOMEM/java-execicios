import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double x1 = 4.00;
        double x2 = 4.50;
        double x3 = 5.00;
        double x4 = 2.00;
        double x5 = 1.50;

        Scanner sc = new Scanner(System.in);
        System.out.println("escolha algo do cardapio? ");
        double a = sc.nextDouble();
        System.out.println("quer algo mais? ");
        double b = sc.nextDouble();


       if(a == 1){
           System.out.println(x1 );
       }else if(a == 2){
           System.out.println(x2 );
       }else if(a == 3){
           System.out.println(x3);
       }else if(a == 4){
           System.out.println(x4);
       }else if(a == 5){
           System.out.println(x5);
       }
        if(b == 1){
            System.out.println(x1);
        }else if(b == 2){
            System.out.println(x2);
        }else if(b == 3){
            System.out.println(x3);
        }else if(b == 4){
            System.out.println(x4);
        }else if(b == 5){
            System.out.println(x5);
        }
    }
    }

