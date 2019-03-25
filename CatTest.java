import java.awt.*;
/**
* Title      : CatTest.java
* Description: This class contains the test class for Cat.
* Copyright  : Copyright (c) 2006 ‐ 2019
* @author  Laurissa Tokarchuk
* @version 1.0
* @author  Paula Fonseca
* @version 1.3
*/
public class CatTest {
    public static void main(String[] args) {
        // Cat myCat = new Cat();
        // myCat.name = "Nickos";
        // myCat.furType = "short";
        // myCat.tail = true;
        // myCat.colour = Color.ORANGE;
        // myCat.speed = 200; // in metres per minute

        Cat[] cats = {new Cat("Tom", "short", true, Color.BLACK, 500), new Cat("Moggy", "long", false, Color.WHITE, 400)};
        
        for (int i = 0;i < 2; i++) {
            System.out.println("name = " + "\"" + cats[i].getName() + "\"");
            System.out.println("tail = " + cats[i].getTail());
            System.out.println("speed = " + cats[i].getSpeed());
            System.out.println("furType = " + "\"" + cats[i].getFurType() + "\"");
            System.out.println("colour = " + cats[i].getColour());
            System.out.println();
        }
        
    }
}
