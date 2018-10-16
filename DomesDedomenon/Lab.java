
public class Lab {
    private Student[] s; 
    private String Tmima_ergastiriou;
    
    public Lab(){
        s=new Student[23];
    }
    public Lab(String tmima,int size){
        Tmima_ergastiriou=tmima;
        s=new Student[size];
    }

    
    public Lab(String tmima,Student[] a){
        Tmima_ergastiriou=tmima;
        s=a;
    }
     public String getTmima_ergastiriou() {
        return Tmima_ergastiriou;
    }
    public void EisagogiFoititi(Student a){
        for(int i=0;i<s.length;i++){
            if(s[i]==null){
                s[i]=a;
                break;
            }
        }
    }
    
    public void DiagrafiFoititi(int am){
        for(int i=0;i<s.length;i++){
            if(s[i].getAM()==am){
                s[i]=null;
            }           
        }
    }
    
    public boolean AnazitisiFoititi(int am){
        for(int i=0;i<s.length;i++){
            if(s[i].getAM()==am){
                return true;
            }
        }
        return false;
    }
    
    public void Parousiologio(){
        for(int i=0;i<s.length;i++){
            if (s[i]!=null){
                System.out.println(s[i]);
            }
        }
    }
    
    public int Plithos_ergastiriou(){
        int sum=0;
        for(int i=0;i<s.length;i++){
                if (s[i]!=null){
                sum++;
            }
        }
        return sum;
    }
    public int FoititesPouPetyxan(){
        int sum=0;
        for(int i=0;i<s.length;i++){
                if (s[i].getGrade()>=5){
                sum++;
                }
        }
        return sum;
    }
    public int FoititesPouApetixan(){
        int sum=0;
        for(int i=0;i<s.length;i++){
                if (s[i].getGrade()<5){
                sum++;
                }
        }
        return sum;
    }
    
}
