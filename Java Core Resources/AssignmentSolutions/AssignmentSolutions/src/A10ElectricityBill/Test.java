package A10ElectricityBill;

public class Test {

	public static void main(String[] args) {
		ElectricityBill bill1 = new ElectricityBill();
		ElectricityBill bill2 = new ElectricityBill();
		
		bill1.setMeterNo(356);
		bill1.setName("someone");
		bill1.setAddress("amazing road");
		
		bill2.setMeterNo(356);
		bill2.setName("anyone");
		bill2.setAddress("fabulous ave");
		
		System.out.println(bill1.equals(bill2));
		System.out.println(bill1.toString());
		System.out.println(bill2.hashCode());
	}

}
