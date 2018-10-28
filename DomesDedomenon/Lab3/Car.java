
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Car {
    private String pinakida;
    private int kibika;
    ArrayQueue a;
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    String time;
    
    public Car(String pinakida, int kibika) {
        this.pinakida = pinakida;
        this.kibika = kibika;
        time=dateFormat.format(date);
    }

    public String getTime() {
        return time;
    }
    

    @Override
    public String toString() {
        return "Car{" + "pinakida=" + pinakida + ", kibika=" + kibika + '}';
    }

    
    
    
    
}
