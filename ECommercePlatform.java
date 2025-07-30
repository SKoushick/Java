public class ECommercePlatform {
public static void main(String[] args) {
// Sample usage:
double originalTotal = 100.0;
boolean isPromotionActive = true;
// Calculate the discounted total
double discountedTotal = calculateDiscount(originalTotal,

isPromotionActive);

// Display the results
System.out.println("Original Total: $" + originalTotal);
System.out.println("Is Promotion Active:" +isPromotionActive);

System.out.println("Discounted Total: $" + discountedTotal);
}

public static double calculateDiscount(double

originalTotal, boolean isPromotionActive) {
// Use the ternary operator to conditionally apply the discount

double discountedTotal = isPromotionActive ?originalTotal

* 0.90 : originalTotal;
return discountedTotal;
}
}