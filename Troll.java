import static java.lang.System.out;
import java.util.Random;

public class Troll extends Monster {
    // constructor
    Troll (String name) {
        super(name);
    }

    Troll (String name, float spAttackProbability) {
        super(name, spAttackProbability);
    }

    
    // setters and getters
    public void setName(String name) { 
        /**
         * @param name: Troll's name
         */
        this.setName(name);
        String default_name = "Detritus";
        String bad_names[] = new String[] {"Saul", "Salomon"};
        for(String bad_name : bad_names) {
            if (name == bad_name) {
                out.println("Error: Troll's name cannot be " + bad_name + ".");
                this.setName(default_name);
                break;
            }
        }
    }
    public String getName() { 
        /** 
         * @return Troll's name
         */
        return this.name;
    }

    public int generic_attack() {
        /**
         * @return damage done
         */
        int dmg = new Random().nextInt(5) + 1;
        out.println(this.name + ", of type " + this.getClass() + ", attacks generically: " + dmg + " poitns damage caused.");

        return dmg;
    }

    public int special_attack() {
        /**
         * @return damage done
         */

        int dmg = new Random().nextInt(15) + 1;
        out.println(this.name + ", of type " + this.getClass() + ", hitting with a stick; " + dmg + "points damage caused.");

        return dmg;
    }
}













