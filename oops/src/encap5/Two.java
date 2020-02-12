package encap5;

public class Two {
private double balance;
private String balance_enquiry;
private String amount_transfer;

public double getbalance() {
	return balance;
}
public String getbalance_enquiry() {
	return balance_enquiry;
}
public String getamount_transfer() {
	return amount_transfer;
}

public void setbalance(double balance) {
	this.balance=balance;
}

public void setbalance_enquiry(String balance_enquiry) {
	this.balance_enquiry=balance_enquiry;
}

public void setamount_transfer(String amount_transfer) {
	this.amount_transfer=amount_transfer;
}


public static void main(String[]args) {
Two t=new Two();

t.setbalance(555);
t.setbalance_enquiry("15000");
t.setamount_transfer("5000");


System.out.print("My balance is "+t.getbalance()+"  My balance_encury  "+t.getbalance_enquiry()+ "    Amount to be transfer"+t.getamount_transfer());

}

}
