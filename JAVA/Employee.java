
public abstract class Employee {
	private String eponymia;
	private int PT;
	public Employee(String eponymia, int pT) throws PayTypeException {
		this.eponymia = eponymia;
	
		if (pT<0 || pT>2) {
			throw new PayTypeException("WRONG 0-Misthotos, 1-Oromisthios, 2-Symbasiouxos");
		}	
		PT = pT;
	}
	public String getEponymia() {
		return eponymia;
	}
	public int getPT() {
		return PT;
	}
	public abstract String getPayTpe();

}
