
public class PayRollDepartment implements IObserver {

	@Override
	public void notifyMe(String message) {

		System.out.println("PayRoll Department - "+message);
		
	}

}
