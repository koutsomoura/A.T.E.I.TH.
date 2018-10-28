
public class MainSchool {
 
    public static void main (String [] args){
        Student[] s=new Student[5];
        
        s[0]=new Student(123,"Maria", "Karaxatzi", 21, 'F', 2, 2);
        s[1]=new Student(124,"Kosta", "Karaxatzi", 21, 'F', 2, 5);
        s[2]=new Student(125,"dasd", "Karaxatzi", 21, 'F', 2, 6);
        s[3]=new Student(126,"Petros", "Karaxatzi", 21, 'F', 2, 2);
        s[4]=new Student(127,"Nikos", "Karaxatzi", 21, 'F', 2, 2);
        
        Student[] k=new Student[2];
        k[0]=new Student(834,"ADWA", "Karaxatzi", 21, 'F', 2, 4);
        k[1]=new Student(835,"SDAW", "Karaxatzi", 21, 'F', 2, 5);
        
        Lab []l=new Lab[2];
        l[0]=new Lab("T1",s);
        l[1]=new Lab("T2",k);
        
        LaboratoryCourse o=new LaboratoryCourse("Domes",l);
        o.PlithosFoititonAnaMathima();
        o.Apotelesmata();
        o.AverageOfLesson();
        o.SuccessRate();
       
        
    }
    
}
