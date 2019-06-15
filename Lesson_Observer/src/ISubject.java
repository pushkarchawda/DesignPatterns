
public interface ISubject {
	
	void addObserver(IObserver aObserver);
	void removeObserver(IObserver aObserver);
	void notifyAllObservers(String message);

}
