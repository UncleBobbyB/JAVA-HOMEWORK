import java.util.*;

/**
 *  Title: TestingMonsters.java
 *  Description: This class is the test class for Mosnrers.
 *  @author: Laurissa Tokarchuk
 *  @version 1.0
 *  @author: Paula Fonseca
 *  @version: 1.1
 *  @author Yingjie Jiang
 *  @version: 1.2
 */

public class TestingMonsters {
    public static void main (String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        monsters.add(new Troll("Tom"));
        monsters.add(new Troll("George"));

        monsters.add(new Dragon("Smaug"));
        monsters.add(new Dragon("Jabosh"));

        int damageDone = 0;
        while (damageDone < 100) {
            for (Monster m : monsters) {
                m.move((int)(Math.random() * 4) + 1);
                damageDone += m.attack();
            }
        }
    }
}
