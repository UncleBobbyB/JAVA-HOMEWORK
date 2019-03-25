public class CounterTest {
    public static void main(String[] args) {
        Counter cntr = new Counter();
        cntr.setMax(10);

        System.out.println(cntr);
        for (int i = 0; i < 6; i++) {
            cntr.increase();
            System.out.println("Increasing count by 2, result: count = " + cntr.getCount());
        }

        System.out.println("Setting count to max");
        cntr.setCount(cntr.getMax());
        System.out.println("Count = " + cntr.getCount());
        for (int i = 0; i < 6; i++) {
            cntr.decrease();
            System.out.println("Decreasing count by 2, result: count = " + cntr.getCount());
        }

        System.out.println("Restting...");
        cntr.Reset();
        System.out.println("Count = " + cntr.getCount());
        for (int i = 0 ; i < 4; i++) {
            cntr.increase(3);
            System.out.println("Increasing count by 3, result: count = " + cntr.getCount());
        }

        System.out.println("Setting count to max...");
        cntr.setCount(cntr.getMax());
        System.out.println("Count = " + cntr.getCount());
        for (int i = 0 ; i < 4; i++) {
            cntr.decrease(3);
            System.out.println("Decreasing count by 3, result: count = " + cntr.getCount());
        }

        System.out.println("Setting count to 1");
        cntr.setCount(1);
        System.out.println("Count = " + cntr.getCount());
        for (int i = 0; i < 3; i++) {
            cntr.doubler();
            System.out.println("Doubling count, result: count = " + cntr.getCount());
        }
    }
}



















