public class BMICalculator {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        double ans = 1.0 * weight / (0.01 * 0.01 * height * height);
        System.out.println("Your weight: " + weight + "kg");
        //System.out.println("Your height: " + (1.0 * height / 100) + "m");
        System.out.printf("Your BMI: %.2f", ans);
        System.out.println("Your BMI: " + ans);
        System.out.print("Your are in ");
        if (ans < 18.5) {
            System.out.print("Underweight");
        } else if (ans >= 18.5 && ans < 24.9) {
            System.out.print("Normal");
        } else if (ans >= 25 && ans < 29.9) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
        System.out.println(" range");
    }
}
