public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double totalDue;

        totalDue = cardBalance * 1.17;
        System.out.println("The interest due for the first month is: " + totalDue);

        totalDue = totalDue * 1.17;
        System.out.println("The interest due for the second month is: " + totalDue);
    }
}