
public class MainSchool {
 
    public static void main (String [] args){
        Student[] s=new Student[5];
        
        s[0]=new Student(123,"Maria", "Karaxatzi", 21, 'F', 2, 12.4);
        s[1]=new Student(124,"Kosta", "Karaxatzi", 21, 'F', 2, 12.4);
        s[2]=new Student(125,"dasd", "Karaxatzi", 21, 'F', 2, 12.4);
        s[3]=new Student(126,"Petros", "Karaxatzi", 21, 'F', 2, 1);
        s[4]=new Student(127,"Nikos", "Karaxatzi", 21, 'F', 2, 4);
        
        Student[] k=new Student[2];
        k[0]=new Student(834,"ADWA", "Karaxatzi", 21, 'F', 2, 4);
        k[1]=new Student(835,"SDAW", "Karaxatzi", 21, 'F', 2, 12.4);
        
        Lab b=new Lab("t1",s);
        Lab b2=new Lab("t2",k);

        LaboratoryCourse []Mathima=new LaboratoryCourse[2];
        Mathima[0]=new LaboratoryCourse("KOsmitalogia",b);
        Mathima[1]=new LaboratoryCourse("Kosmimatologia",b2);
        
        LaboratoryCourse.PlithosFoititonAnaMathima(Mathima);
        LaboratoryCourse.Apotelesmata(Mathima);
        
    }
    
}
