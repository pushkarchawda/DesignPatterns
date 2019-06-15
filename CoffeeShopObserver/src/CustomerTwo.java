
public class CustomerTwo implements IObserver {

	@Override
	public void notifyMe(String message) {

		System.out.println("CustomerTwo : "+message);
		
	}

}
