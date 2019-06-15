
abstract public class ManufacturingProcess {
	
	abstract public void assemble();
	abstract public void testing();
	abstract public void packing();
	abstract public void storing();
	
	public void lunchProcess()
	{
		assemble();
		testing();
		packing();
		storing();
	}

}
