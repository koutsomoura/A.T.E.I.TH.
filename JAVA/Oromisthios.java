
public class Oromisthios  extends Employee implements iOromisthios{
	private double ores_ergasias;
	private double oromithio;

	public Oromisthios(String eponymia, int pT,double ores_ergasias,double oromithio) throws PayTypeException, PayTypeExceptionOromisthios {
		super(eponymia, pT);
		if (pT!=1) {
			throw new PayTypeExceptionOromisthios("You create Oromisthios! PayType must be 1!");
		}
		this.ores_ergasias=ores_ergasias;
		this.oromithio=oromithio;
	}

	public double getOres_ergasias() {
		return ores_ergasias;
	}

	public double getOromithio() {
		return oromithio;
	}

	@Override
	public void katharos_Oromisthious() {
		double result =getOres_ergasias()* getOromithio()-(getOres_ergasias()* getOromithio())*0.10;
		System.out.println("misthos:"+result);
	}

	@Override
	public String getPayTpe() {
		if (getPT()==1) {
			return "Oromisthios";
		}
		return "-1";
	}
	public String toString() {
		return getPayTpe()+" "+getEponymia()+" ores ergasias:"+getOres_ergasias()+" oromisthio:"+getOromithio()+" ";
	}

}
