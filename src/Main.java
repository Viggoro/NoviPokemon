package src;

public class Main {
    public static void main(String[] args) {

       Pokemon pokemon = new Pokemon("Bulbasaur", 1, 110, 10, new GrassType());

       Pokemon pokemon1 = new Pokemon("Charmander", 1, 110, 10, new FireType());

       Pokemon pokemon2 = new Pokemon("Pikachu", 1, 110, 10, new ElectricType());

       Pokemon pokemon3 = new Pokemon("Piplup", 1, 110, 10, new WaterType());

       pokemon.printPokemon();
       pokemon.speaks();
       pokemon1.printPokemon();
       pokemon1.speaks();
       pokemon2.printPokemon();
       pokemon2.speaks();
       pokemon3.printPokemon();
       pokemon3.speaks();

    }
}
