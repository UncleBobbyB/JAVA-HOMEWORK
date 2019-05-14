/**
* Title : Counter.java
* Description: Just homework.
* Copyright : No copyright.:)
* @author Yingjie Jiang 
* @version √2
*/
public class Counter {
    // private variables
    private int count, max;

    // Constructor
    /**
     * I'm lazy, so here's the comment.:)
     */
    Counter() {
        this.count = 0;
        this.max = 10;
    }

    Counter(int max) {
        this.max = max;
        this.count = 0;
    }

    // Counter(int count) {
    //     this.count = count;
    //     this.max = 10;
    // }

    //Getters and Setters
    /**
     * I'm lazy, so here's the comment.:)
     */
    public int getCount() {
        return this.count;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void setCount(int n) {
        this.count = n;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public int getMax() {
        return this.max;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void setMax(int n) {
        this.max = n;
    }


    // Methods
    /**
     * I'm lazy, so here's the comment.:)
     */
    public void increase() {
         this.count += 2;

         this.count %= this.max;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void increase(int n) {
        this.count += n;
        this.count %= this.max;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void decrease() {
        if (this.count > 0) {
            this.count -= 1;
        }
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void decrease(int n) {
        this.count -= n;
        if (this.count < 0) {
            this.count = 0;
        }
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void doubler() {
        this.count *= 2;
        this.count %= this.max;
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public void Reset() {
        this.count = 0;
        System.out.println("Counter Reset!");
    }

    /**
     * I'm lazy, so here's the comment.:)
     */
    public String toString() {
        return "Count: " + this.count + ", Max: " + this.max;
    }

}

































