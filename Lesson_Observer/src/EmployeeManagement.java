import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement implements ISubject,IManagementSystem {

	private List<IObserver> observers;
	private List<Employee> employees;
	
	public EmployeeManagement() {
		observers = new ArrayList<>();
		employees = new ArrayList<>();
	}

	@Override
	public void addObserver(IObserver aObserver) {
		observers.add(aObserver);
	}

	@Override
	public void removeObserver(IObserver aObserver) {
		observers.remove(aObserver);
	}

	@Override
	public void notifyAllObservers(String message) {
		for (IObserver aObserver : observers) {
			aObserver.notifyMe(message);
		}
	}

	@Override
	public void addNewHire(Employee aEmployee) {
		employees.add(aEmployee);
	}

	@Override
	public void removeHire(Employee aEmployee) {
		employees.remove(aEmployee);
	}

}
