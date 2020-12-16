import java.util.Random;

public class Character {
    private int strength;
    private int tough;
    private int intelligence;
    private int magic;
    private int influence;

    Random rand = new Random();

    public Character(String type) {
        if (type.equals("Knight")) {
            this.strength = rand.nextInt(4) + 7; // main ability (7-10)
            // rest of skils chosen randomly from 0-6
            this.tough = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        }

        if (type.equals("Peasant")) {
            this.tough = rand.nextInt(4) + 7; // main ability (7-10)
            // rest of skils chosen randomly from 0-6
            this.strength = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        }

        if (type.equals("Cleric")) {
            this.intelligence = rand.nextInt(4) + 7; // main ability (7-10)
            // rest of skils chosen randomly from 0-6
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        }

        if (type.equals("Mage")) {
            this.magic = rand.nextInt(4) + 7; // main ability (7-10)
            // rest of skils chosen randomly from 0-6
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.influence = rand.nextInt(6);
        }

        if (type.equals("Courtier")) {
            this.influence = rand.nextInt(4) + 7; // main ability (7-10)
            // rest of skils chosen randomly from 0-6
            this.strength = rand.nextInt(6);
            this.tough = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
        }

    }

    String[] type = {"Knight", "Peasant", "Cleric", "Mage", "Courtier"};

    public int getStrength() {
        return this.strength;
    }

    public int getTough() {
        return this.tough;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getInfluence() {
        return this.influence;
    }

    public String toString() {
        return this.type + "," + String.valueOf(this.strength) + "," + String.valueOf(this.tough) + "," + String.valueOf(this.intelligence) + "," + String.valueOf(this.magic) + "," + String.valueOf(this.influence);
    }



}

