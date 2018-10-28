import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MenuContex {
     static boolean k=true;

    public static void Menu2(ArrayQueue a){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------");
        System.out.println("1 ADD");
        System.out.println("2 REMOVE");
        System.out.println("3 Exit");
        System.out.println("------------------");
        System.out.println("------------------");

        int input;
        while(true){
            try {
                input=Integer.parseInt(br.readLine());
                break;
            } catch (IOException ex) {
                ex.getMessage();
                System.out.println("Error input");
                return;
            }catch(NumberFormatException e){
                System.out.println("Error input");
                e.getMessage();
                return;
            }
        }
        switch(input){
            case 1: 
                ADDCar(a);
                break;
            case 2:
                RemoveCar(a);
                break;
            case 3:
                k=false;
                return;
        
        }
    
    }
    public static void Menu(ArrayQueue a){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String time=dateFormat.format(date);
        System.out.println("----++++++++---");
        System.out.println(a.front());
        System.out.println("Afi3h autokinitou:  "+((Car)a.front()).getTime());
        System.out.println("Anaxorizh autokinitou:  "+time);
        a.remove();
        System.out.println("Katastasi ouras:"+a.APOTELESMA());
        System.out.println("Exit");
        System.out.println("----++++++++---");
    
    }
    public static void ADDCar(ArrayQueue a){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String number = null;
    int kidika=0;
        try {
            System.out.println("Number plate:");
            number=br.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }
        while (true){
            try {
                System.out.println("Hp:");
                kidika=Integer.parseInt(br.readLine());
                break;
            }catch (IOException ex) {
                ex.getMessage();
            }catch(NumberFormatException e){
                System.out.println("Error input---");
                e.getMessage();
            }
        }
        Car carItem=new Car(number,kidika);
        a.add(carItem);
    
    
    }
    public static void RemoveCar(ArrayQueue a){
        if(a.isEmpty()){
            System.out.println("THE QUEUE IS EMPTY");
            return;
        }
        Menu(a);    
    }

  
}
