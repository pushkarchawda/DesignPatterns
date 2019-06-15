
public class Order {

	private int id;
	public Order(int id, String order, String custName) {
		super();
		this.id = id;
		Order = order;
		this.custName = custName;
	}

	private String Order;
	private String custName;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getOrder() {
		return Order;
	}

	public void setOrder(String order) {
		Order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Order [Order=" + Order + ", custName=" + custName + ", id=" + id + "]";
	}

	
}
