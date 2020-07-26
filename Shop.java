package Assignment6;

import java.util.Date;
import java.util.Scanner;

public class Shop {
Customer customer;
Date date;
double serviceExpense;
double productExpense;

public Shop(Customer customer,double serviceExpense,double productExpense,Date date) {
	this.customer=customer;
	this.date=date;
	this.serviceExpense=serviceExpense;
	this.productExpense=productExpense;
}
public double getTotalExpense() {
	double tolExp;
	if(customer.isMember()) {
		tolExp=(serviceExpense+productExpense)-((serviceExpense*DiscountRate.getServiceDiscountRate(customer.memberType))+(productExpense*DiscountRate.getProductDiscountRate(customer.memberType)));
	}
	else {
		tolExp=serviceExpense+productExpense;
	}
	return tolExp;
}
public String toString() {
	return (customer.toString() + "\nService Expense:" + serviceExpense + "\nProduct Expense:" + productExpense + "\nTotalExpense:" + getTotalExpense() + "\nDate:" + date + '\n');
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer c=new Customer();
        Scanner sc=new Scanner(System.in);
        String ans;
        do {
            c.memberType="Normal";
            System.out.print("Enter Your Name:");
            c.name=sc.next();
            System.out.print("Do you have member card");
            String mc=sc.next();
            if(mc.equals("yes")) {
            	System.out.print("Enter Your Member Type");
            	c.memberType=sc.next();
             }
            System.out.print("Enter Your Service Expense");
            double service=sc.nextDouble();
        	System.out.print("Enter Your Product Expense");
        	double product=sc.nextDouble();
        	
        	Shop o=new Shop(c,service,product,new Date());
        	System.out.print(o.toString());
        	
        	System.out.print("Have next customer:");
        	ans=sc.next();
        	
        }
        while(ans.equals("yes"));
        sc.close();
        
	}

}
