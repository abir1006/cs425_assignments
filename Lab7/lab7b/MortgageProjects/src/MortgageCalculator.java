import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {

    public double computeMaximumMortgage(
            int birthYear,
            int birthMonth,
            int birthDay,
            double monthlyIncome,
            boolean isMarried,
            double spouseMonthlyIncome,
            String profession) {

        double maximumMortgage = 0;
        //calculate age
        LocalDate todayDate = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);

        Period period = Period.between(dateOfBirth, todayDate);
        int age = period.getYears();
        System.out.println(age);

        if (age < 18) return maximumMortgage;

        if (isMarried) monthlyIncome += spouseMonthlyIncome * 0.94;

        return getMaximumMortgage(monthlyIncome, profession);
    }

    private double getMaximumMortgage(double monthlyIncome, String profession) {
        boolean professionGroup1 = profession.equals("Developer") || profession.equals("Architect") || profession.equals("Scrum master");
        boolean professionGroup2 = profession.equals("Tester") || profession.equals("System Administrator") || profession.equals("Technical writer");
        boolean professionGroup3 = profession.equals("Department head") || profession.equals("Professor");
        double maximumMortgage = 0;

        if (monthlyIncome >= 5000) {
            if (professionGroup1) maximumMortgage = 220000;
            else if (professionGroup2) maximumMortgage = 160000;
            else if (professionGroup3) maximumMortgage = 280000;
        } else if (monthlyIncome >= 3000) {
            if (professionGroup1) maximumMortgage = 220000;
            else if (professionGroup2) maximumMortgage = 160000;
            else if (professionGroup3) maximumMortgage = 280000;
        } else if (monthlyIncome >= 2000) {
            if (professionGroup1) maximumMortgage = 160000;
            else if (professionGroup2) maximumMortgage = 120000;
            else if (professionGroup3) maximumMortgage = 220000;
        }
        return maximumMortgage;


    }
}
