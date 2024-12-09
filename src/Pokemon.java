package src;

public class Pokemon {
    private Type type;
    private String name;
    private int level;
    private int hp;
    private int sp;
    private int heigth;
    private int weight;

    public Pokemon(String name, int level, int hp, int sp, Type type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.sp = sp;
        this.type = type;
    }

    public Pokemon(String name, int level, int hp, int sp, Type type, int heigth, int weight) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.sp = sp;
        this.heigth = heigth;
        this.weight = weight;
        this.type = type;
    }

    public void printPokemon() {
        System.out.println("Name: " + name + " Level: " + level + " HP: " + hp + " SP: " + sp + " Type: " + type.getType());
        printWeakness();
    }

    public void printWeakness() {
        System.out.println("Weakness(es): " + type.getWeaknesses());
    }

    public void speaks() {
        switch (name) {
            case "Pikachu":
                System.out.println("Pika pika!");
                break;
            case "Bulbasaur":
                System.out.println("wat bulbasaur zegt");
                break;
            default:
                System.out.println("bah");
        }
    }
}
