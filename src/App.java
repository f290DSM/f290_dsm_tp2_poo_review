import java.util.Scanner;

import domain.Charmander;
import domain.Pikachu;
import domain.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        Charmander charmander = new Charmander("Charmander", 1500, 112);
        System.out.println(charmander);
        charmander.iChooseYou();
    }
}
