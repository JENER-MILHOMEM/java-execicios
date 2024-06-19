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
        System.out.println("quer algo mais?, se não só aperte digite 0 ");
        double b = sc.nextDouble();
        double escolha1 = 0;
        double escolha2 = 0;

        if (a == 1 && b == 1) {
            escolha1 = x1;
             escolha2 = x1;
        }
        if (a == 2) {
            escolha1 = x2;
             escolha2 = x2;
        }
        if (a == 3) {
             escolha1 = x3;
             escolha2 = x3;
        }
        if (a == 4) {
             escolha1 = x4;
             escolha2 = x4;
        }
        if (a == 5) {
             escolha1 = x5;
             escolha2 = x5;
        }

        System.out.println(escolha1 + escolha2);


    }
}

