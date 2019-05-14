import java.util.Random;
import static java.lang.System.out;

public class Dragon extends Monster {

    // constuctor
    Dragon(String name) {
        super(name);
    }

    Dragon(String name, float spAttackProbability) {
        super(name, spAttackProbability);
    }

    public int generic_attack() {
        /**
         * @return damage done
         */
        int dmg0 = new Random().nextInt(50) + 1;
        out.println(this.name + ", of type " + this.getClass() + ", attacks by breathing fire; " + dmg0 + " points damage caused.");
        
        int dmg1 = new Random().nextInt(5) + 1;
        out.println(this.name + ", of type " + this.getClass() + ", attacks generically: " + dmg1 + " poitns damage caused.");

        return dmg0 + dmg1;
    }

    public int special_attack() {
        /**
         * @return damage done
         */
        int dmg = new Random().nextInt(15) +  1;
        out.println(this.name + ", of type " + this.getClass() + ", attacks by breathing fire; " + dmg + " points damage caused.");

        return dmg;
    }
}
