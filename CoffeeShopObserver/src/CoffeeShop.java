
public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopAttendant sa = new ShopAttendant();
		
		IObserver c1 = new CustomerOne();
		IObserver c2 = new CustomerTwo();
		
		Order o1 = new Order(1, "nachos+hardCoffee", "customerOne");
		Order o2 = new Order(2, "ColdCoffee", "customerTwo");
		
		sa.addObserver(c2);
		sa.addObserver(c1);
		
		sa.placeOrder(o2);
		sa.placeOrder(o1);
		
		sa.collectOrder(o1);
		
		sa.removeObserver(c2);
		
		sa.collectOrder(o2);
		
		
		
	}

}
