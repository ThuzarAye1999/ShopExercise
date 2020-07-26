package Assignment6;

public class DiscountRate {
static double serviceDiscountPremium=0.2;
static double serviceDiscountGold=0.15;
static double serviceDiscountSilver=0.1;
static double productDiscountPremium=0.1;
static double productDiscountGold=0.1;
static double productDiscountSilver=0.1;

public static double getServiceDiscountRate(String type) {
	double serviceExpense=0.0;
	if(type.equals("Premium")) {
		serviceExpense=serviceDiscountPremium;
	}
	else if(type.equals("Gold")) {
		serviceExpense=serviceDiscountGold;
	}
	else if(type.equals("Silver")) {
		serviceExpense=serviceDiscountSilver;
	}
	return serviceExpense;
}
public static double getProductDiscountRate(String type) {
	double productExpense=0.0;
	if(type.equals("Premium")) {
		productExpense=productDiscountPremium;
	}
	else if(type.equals("Gold")) {
		productExpense=productDiscountGold;
	}
	else if(type.equals("Silve")) {
		productExpense=productDiscountSilver;
	}
	return productExpense;
}
}
