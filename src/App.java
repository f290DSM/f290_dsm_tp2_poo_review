import java.util.Scanner;

import domain.Pikachu;
import domain.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Pikachu pikachu = new Pikachu("Pikachu", 1500, 112);
        System.out.println("Digite o valor do CP");
        int cp = in.nextInt();
        if (cp <= 0) {
            System.out.println("CP não pode ser menor ou igual a 0");
        } else {
            pikachu.setCp(cp);
        }
        System.out.println(pikachu);
        in.close();
    }
}
