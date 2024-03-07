import java.util.Arrays;
import java.util.List;

import domain.Charmander;
import domain.Pikachu;
import domain.Pokemon;
import domain.Squirtle;
import domain.Zapdos;
import domain.intefaces.ElectricType;
import domain.intefaces.FireType;
import domain.intefaces.FlyingType;
import domain.intefaces.WaterType;

public class App {
    public static void main(String[] args) throws Exception {
        Pikachu pikachu = new Pikachu("Pikachu", 1500, 112);
        Charmander charmander = new Charmander("Charmander", 800, 90);
        Squirtle squirtle = new Squirtle("Squirtle", 790, 87);
        Zapdos zapdos = new Zapdos("Zapdos", 1790, 87);

        List<Pokemon> pokemons = Arrays.asList(pikachu,
                charmander, squirtle, zapdos);

        String template = 
                "\n\n%s é instancia de Pokemon: %s\n" +
                "é instancia de ElectricType: %s\n" +
                "é instancia de FireType: %s\n" +
                "é instancia de FlyingType: %s\n" +
                "é instancia de WaterType: %s\n\n";

        for (Pokemon pokemon : pokemons) {
            System.out.printf(template,
                    pokemon.getClass().getSimpleName(),                    
                    (pokemon instanceof Pokemon),
                    (pokemon instanceof ElectricType),
                    (pokemon instanceof FireType),
                    (pokemon instanceof FlyingType),
                    (pokemon instanceof WaterType));
            pokemon.attack();
        }

        Pokemon pokemon = new Zapdos("Zapdos", 1000, 120);
        pokemon.attack();
    }
}


