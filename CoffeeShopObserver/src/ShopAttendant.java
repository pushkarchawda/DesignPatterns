import java.util.ArrayList;
import java.util.List;

public class ShopAttendant implements ISubject {
	
	private List<IObserver> customers;
	private List<Order> orders;
	Order o;

	public ShopAttendant() {
		super();
		this.customers = new ArrayList();
		this.orders = new ArrayList();
	}


	public void placeOrder(Order o) {
		String s = "Placing Order : "+o.getId();
		System.out.println(s);
		//notifyAllObservers(s+" customer name :" +o.getCustName());
		orders.add(o);
	}
	
	
	public void collectOrder(Order o) {
		String s = "Collecting Order : "+o.getId();
		System.out.println(s);
		notifyAllObservers(s+" customer name :" +o.getCustName());
		orders.remove(o);
	}

	@Override
	public void addObserver(IObserver o) {
		
		customers.add(o);
		System.out.println("You will be notified with orders..");

	}

	@Override
	public void removeObserver(IObserver o) {
		customers.remove(o);
		System.out.println("You will not be notified with orders..");

	}

	@Override
	public void notifyAllObservers(String message) {
		
		for(IObserver c: customers)
		{
			c.notifyMe(message);
		}
	}

}
