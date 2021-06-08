package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customers cus = new Customers(null, null, 0, 0, 0, 0);
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so luong khach hang: ");
		int n = input.nextInt();
		ArrayList<Customers> danhSach = new ArrayList<Customers>();
		for(int i = 1; i <= n; i++) {
			input.nextLine();
			System.out.println("Nhap thong tin cua khach hang thu " +i);
			System.out.println("Ho va ten cua khach hang: ");
			String fullName = input.nextLine();
			System.out.println("Dia chi cua khach hang: ");
			String address = input.nextLine();
			System.out.println("So dien thoai cua khach hang: ");
			int phone = input.nextInt();
			System.out.println("Tong tien khi khong co chiet khau voi thue: ");
			float moneyBeforeDiscountAndTax = input.nextFloat();
			System.out.println("Chiet khau: ");
			float disCount = input.nextFloat();
			System.out.println("Thue: ");
			float tax = input.nextFloat();
			Customers deTails = new Customers(fullName,address,phone,moneyBeforeDiscountAndTax,disCount,tax);
			danhSach.add(deTails);
			
		}	
		System.out.println("Thong tin cua khach hang la:");
		System.out.printf("%6s %10s %20s %40s %15s %10s\n","Tên khách hàng","Địa chỉ","Số điện thoại","Tổng tiền trước chiết khấu và thuế","Chiết khấu","Thuế");
		for(Customers details : danhSach) {
			details.printCustomerDetails();
		}
		
		System.out.println("So tien cua khach hang la:");
		for(Customers money : danhSach) {
			System.out.println(money.toString());
		}
		
	}

}
