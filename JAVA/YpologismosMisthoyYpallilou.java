import java.io.*;

public class YpologismosMisthoyYpallilou {
	public static int getInt(String message) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.print(message);
				int num=Integer.parseInt(br.readLine());
				return num;
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static double getDouble(String message) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.print(message);
				double num=Double.parseDouble(br.readLine());
				return num;
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static String getString(String message) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		String s=br.readLine();
		return s;
	}
	public static boolean getBoolean(String message) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		boolean s=Boolean.parseBoolean(br.readLine());
		return s;
	}
	
	public static Misthotos createMisthotos() throws NumberFormatException, IOException, PayTypeException,PayTypeMisthotos {
		while (true) {
			try {
				Misthotos m=new Misthotos(getString("Eponymia:"),getInt("Pay type:"),getDouble("Akatharistos:"),getDouble("Kratiseis:"),getBoolean("Dikaioute bonus;") ,getDouble("Bonus:"));
				return m;
			}catch(PayTypeException e){
				System.out.println(e.getMessage());
	
			}catch(PayTypeMisthotos e){
				System.out.println(e.getMessage());
	
			}
		}
		
	}
	public static Oromisthios createOromisthios() throws NumberFormatException, IOException,PayTypeExceptionOromisthios {
		while (true) {
			try {
				Oromisthios m=new Oromisthios(getString("Eponymia:"),getInt("Pay type:"),getDouble("Ores ergasies:"),getDouble("Oromisthio:"));
				return m;
			}catch(PayTypeException e){
				System.out.println(e.getMessage());
	
			}catch(PayTypeExceptionOromisthios e){
				System.out.println(e.getMessage());
	
			}
		}
	}
	public static void printers(Employee z) {
		System.out.print(z.toString());
		
	}
	public static void main(String [] args) throws NumberFormatException, IOException, PayTypeException, BonusRxception, PayTypeMisthotos, PayTypeExceptionOromisthios {
		
		int n=2;
		Employee[] e=new Employee[n];
		
		for (int i=0;i<1;i++) {
			e[i]=createMisthotos();
			printers(e[i]);
			((Misthotos)e[i]).katharos_Misthotou();
		}
		for (int i=1;i<2;i++) {
			e[i]=createOromisthios();
			printers(e[i]);
			((Oromisthios)e[i]).katharos_Oromisthious();
		}
	}
}
