
public class Misthotos extends Employee implements iMisthotos{
	private double akatharistos;
	private double kratiseis;
	private double bonus_paidion;
	private boolean bonus;
	public Misthotos(String eponymia, int pT,double akatharistos,double kratiseis,boolean bonus,double bonus_paidion) throws PayTypeException, PayTypeMisthotos {
		super(eponymia, pT);
		if (pT!=0) {
			throw new PayTypeMisthotos("You create Misthotos! PayType must be 0");
		}
		this.akatharistos=akatharistos;
		this.kratiseis=kratiseis;
		this.bonus=bonus;
		this.bonus_paidion=bonus_paidion;
	}

	@Override
	public String getPayTpe() {
		if (getPT()==0) {
			return "Misthotos";
		}
		return "-1";
	}
	public double getAkatharistos() {
		return akatharistos;
	}

	public double getKratiseis() {
		return kratiseis;
	}

	public double getBonus_paidion() {
		return bonus_paidion;
	}
	public boolean getBonus() {
		return bonus;
	}
	public String toString() {
		return getPayTpe()+" "+getEponymia()+" akatharistos:"+getAkatharistos()+" kratiseis:"+getKratiseis()+" bonus:"+getBonus_paidion()+" ";
	}
	
	@Override
	public void katharos_Misthotou() throws BonusRxception {
		double result=akatharistos-kratiseis;
		try {
			if (getBonus()) {
				result +=bonus_paidion;	
			}else {
				throw new BonusRxception("Den ypologizetai to bonus efoson den dikaioute ara misthos:"+result);
			}
			System.out.println ("misthos:"+result);
		}catch(BonusRxception e) {
			System.out.println(e.getMessage());

		}
	}
	
}
