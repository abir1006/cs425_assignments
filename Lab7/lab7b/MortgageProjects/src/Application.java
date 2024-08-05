
public class Application {

    public static void main(String[] args) {
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        System.out.println(mortgageCalculator.computeMaximumMortgage(1988, 9, 15, 2000, false, 0, "Developer"));
    }

}
