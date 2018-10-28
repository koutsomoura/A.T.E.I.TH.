
public class LaboratoryCourse {



    private Lab[] labs;
    private String Mathima;
    
    public LaboratoryCourse(String n,Lab[] a){
        Mathima=n;
        labs=a;
    }
    public LaboratoryCourse(String n,int size){
        Mathima=n;
        labs=new Lab[size];
    }


    public String getMathima() {
        return Mathima;
    }
    
    public void PlithosFoititonAnaMathima(){
        int sum=0;
        for (int i=0;i<labs.length;i++){
          sum+=labs[i].Plithos_ergastiriou();
            
        }
        System.out.println(sum);
    }
    
    public void Apotelesmata(){
        int pass=0;
        int failed=0;
        int pass_lesson=0;
        int failed_lesson=0;
        for (int i=0;i<labs.length;i++){
            
            pass+=labs[i].FoititesPouPetyxan();
            failed+=labs[i].FoititesPouApetixan();
            pass_lesson+=labs[i].FoititesPouPetyxan();
            failed_lesson+=labs[i].FoititesPouApetixan();
            System.out.println(labs[i].getTmima_ergastiriou()+": total successful students in the Lab:"+pass+" ,total failed student in the Lab:"+failed);
            pass=0;
            failed=0;
        }
        System.out.println(getMathima()+" total successful students:"+pass_lesson+" and total failed students:"+failed_lesson);
    }

    public void AverageOfLesson(){
            double sum_lesson=0;
            double   sum_lab=0;
            for (int i=0;i<labs.length;i++){
                sum_lab+=labs[i].AverageOfLab();
                sum_lesson+=labs[i].AverageOfLab();
                System.out.println(labs[i].getTmima_ergastiriou()+" average "+sum_lab);
                sum_lab=0;

            }
            System.out.println(getMathima()+" averge "+sum_lesson/labs.length);
    }
    
    public void SuccessRate(){
        int pass=0;
        int failed=0;
        int pass_lesson=0;
        int failed_lesson=0;
        int crowd=0;
        for (int i=0;i<labs.length;i++){
            crowd+=labs[i].Plithos_ergastiriou();
            pass+=labs[i].FoititesPouPetyxan();
            failed+=labs[i].FoititesPouApetixan();
            System.out.println(labs[i].getTmima_ergastiriou()+" success rate "+((100*pass)/labs[i].Plithos_ergastiriou())+"%"+",  no-success rate "+((100*failed)/labs[i].Plithos_ergastiriou())+"%");
            pass=0;
            failed=0;
            pass_lesson+=labs[i].FoititesPouPetyxan();
            failed_lesson+=labs[i].FoititesPouApetixan();
        }
        System.out.println(getMathima()+" success rate "+((100*pass_lesson)/crowd)+"%"+",  no-success rate "+((100*failed_lesson)/crowd)+"%");

    }

        
}
