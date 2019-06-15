
public class CustomerOne implements IObserver {

	@Override
	public void notifyMe(String message) {

		System.out.println("CustomerOne : "+message);
		
	}

}
