public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = (month == 3 && day >= 20) || 
                           (month > 3 && month < 6) ||
                           (month == 6 && day <= 20);

        if (isSpring)
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
