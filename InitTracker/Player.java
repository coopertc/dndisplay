public class Player {

    private int initiative;
    private String name;

    public Player(String name, int initiative) {
        this.initiative = initiative;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getInit() {
        return initiative;
    }
}