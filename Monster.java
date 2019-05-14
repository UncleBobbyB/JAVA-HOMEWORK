import static java.lang.System.out;
import java.util.Random;

public abstract class Monster {
    protected String name;
    protected float spAttackProbability = 0.2f;

    // construcor
    Monster(String name) {
        this.name = name;
    }

    Monster(String name, float spAttackProbability) {
        this.name = name;
        this.spAttackProbability = spAttackProbability;
    }

    // getter and setter for protected & private variables
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpAttackProbability() {
        return this.spAttackProbability;
    }

    public void setSpAttackProbability(float spAttackProbability) {
        this.spAttackProbability = spAttackProbability;
    }


    public int attack() {
        /**
         * @return damage done
         */
        boolean sp = Math.random() <= (spAttackProbability); // sp == true means going for special attack, false means normal attack

        if (sp) {
        }
        return generic_attack();
    }

    public abstract int generic_attack();

    public abstract int special_attack();


    public void move(int direction) {
        /**
         * @param direction: 1, 2, 3, means NOTH, EAST, SOUTH respectively,
         * other values means WEST
         */
       switch (direction) {
           case 1:
               out.println(this.name + "is moving 1 step NORTH.");
               break;
            case 2:
               out.println(this.name + "is moving 1 step EAST.");
               break;
            case 3:
               out.println(this.name + "is moving 1 step SOUTH.");
               break;
            default:
               out.println(this.name + "is moving 1 step WEST.");
                break;
       }
    }
}
