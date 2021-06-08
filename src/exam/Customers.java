package exam;


public class Customers {
	private String fullName;
	private String address;
	private int phone;
	private float moneyBeforeDiscountAndTax;
	private float disCount;
	private float tax;
	
	public Customers(String fullName,String address,int phone,float moneyBeforeDiscountAndTax,float disCount,float tax) {
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
		this.moneyBeforeDiscountAndTax = moneyBeforeDiscountAndTax;
		this.disCount = disCount;
		this.tax = tax;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public float getMoneyBeforeDiscountAndTax() {
		return moneyBeforeDiscountAndTax;
	}
	public void setMoneyBeforeDiscountAndTax(float moneyBeforeDiscountAndTax) {
		this.moneyBeforeDiscountAndTax = moneyBeforeDiscountAndTax;
	}
	public float getDisCount() {
		return disCount;
	}
	public void setDisCount(float disCount) {
		this.disCount = disCount;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public void printCustomerDetails() {
		System.out.printf("%6s %15s %15d %20.2f %32.2f %15.2f \n", fullName, address, phone, moneyBeforeDiscountAndTax,disCount,tax );
	}
	public float disCount() {
		return disCount/100;
	}
	
	public float tax() {
		return tax/100;
	}
	
	public float CalculateTheAmount() {
		return (moneyBeforeDiscountAndTax - disCount() + (tax() * moneyBeforeDiscountAndTax));
	}
	
	public String toString() {
		return "Khach hang " + fullName + " phai tra la " + CalculateTheAmount() + " dong";
	}
}
