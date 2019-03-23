public class WeekDayConverter {
    public static void main(String[] args) {
        int weekday = Integer.parseInt(args[0]);
        System.out.print("The " + weekday);
        String[] days = {"Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (weekday == 1) {
            System.out.print("st");
        } else if (weekday == 2) {
            System.out.print("nd");
        } else if (weekday == 3) {
            System.out.print("rd");
        } else {
            System.out.print("th");
        }
        System.out.println(" day of the week is " + days[weekday - 1]);
    }
}
