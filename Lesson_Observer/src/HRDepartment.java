
public class HRDepartment implements IObserver {

	@Override
	public void notifyMe(String message) {

		System.out.println("HR Department - "+message);
		
	}

}
