import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o número inicial:");
        int first = sc.nextInt();

        System.out.println("Escolha o número final:");
        int last = sc.nextInt();

        if (first < last) {
            for (int i = first; i <= last; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        } else {
            System.out.println("número final deve ser maior que o inicial!");
        }
        sc.close();
    }
}
