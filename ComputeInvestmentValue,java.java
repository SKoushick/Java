public class Interest {
    public static double computeInterest(double principal, double rate) {
        return principal * rate;

    }

    public static double ComputeInvestmentValue(double principal, double interest) {
        return principal + interest;
    }

    public static void main(String[] args) {
        double principal = 17000.0;
        double rate = 0.07;

        double interest = computeInterest(principal, rate);

        double investmentValue = computeInvestmentValue(principal, interest);

        System.out.println("Principal Amount: $" + principal);
        System.out.println("Interest Earned: $" + interest);
        System.out.println("Investment Value After One Year: $" + investmentValue);
    }
}