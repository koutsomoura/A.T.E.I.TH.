
public class LaboratoryCourse {



    private Lab l;
    private String Mathima;
    
    public LaboratoryCourse(String n,Lab a){
        Mathima=n;
        l=a;
    }


    public String getMathima() {
        return Mathima;
    }
    
    public static void PlithosFoititonAnaMathima(LaboratoryCourse[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            
            sum+=a[i].l.Plithos_ergastiriou();
        }
        System.out.println(sum);
    }
    
    public static void Apotelesmata(LaboratoryCourse[] a){
        int petixan=0;
        int apetixan=0;
        int sinolo_epitixoton=0;
        int sinolo_apitixoton=0;
        for (int i=0;i<a.length;i++){
            
            petixan+=a[i].l.FoititesPouPetyxan();
            sinolo_epitixoton+=a[i].l.FoititesPouPetyxan();
            apetixan+=a[i].l.FoititesPouApetixan();
            sinolo_apitixoton+=a[i].l.FoititesPouApetixan();
            System.out.println(a[i].l.getTmima_ergastiriou()+" petixan:"+petixan+"kai apetixan:"+apetixan);
            petixan=0;
            apetixan=0;
        }
        System.out.println("petixan:"+sinolo_epitixoton+"kai apetixan:"+sinolo_apitixoton);
    }



        
}
