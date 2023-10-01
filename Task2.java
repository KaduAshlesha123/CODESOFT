
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
    int noSub;
    int TotalMarks;
    float percentage;
    String grade;

    Student(int noSub){
        this.noSub=noSub;
    }

    void TotalMarks(){
        ArrayList <Integer> marks=new ArrayList<>(noSub);
        Scanner sc=new Scanner(System.in);
     
        for(int i=0;i<noSub;i++){
            int num=sc.nextInt();
            if(num<=100){
            marks.add(num);
            }else{
                System.out.println("enter valid number");
                num=sc.nextInt();
                 marks.add(num);
            }
        }
        Iterator<Integer> itr=marks.iterator();
        while(itr.hasNext()){
            int num=itr.next();
            TotalMarks=TotalMarks+num;
        }
    }

    void percentage(){
        this.percentage=TotalMarks/noSub;
       
    }
    void grade(){
        if(percentage >=85){
            grade="A";
        }else if(percentage <=84 && percentage>70){
            grade="B";
        }else if(percentage<=69 && percentage>55){
            grade="C";
        }else if(percentage<=54 && percentage>45){
            grade="D";
        }else{
            grade="Fail";
        }
        
    }

    public String toString(){
        return "Total Makrs : "+ TotalMarks + "\n" +"Percentage : "+percentage + "%\n"+"Grade : "+grade;
        
    }

} 
public class Task2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter no of students : ");
       int nostu=sc.nextInt();

       System.out.print("Enter no of subjects : ");  
       int noSub=sc.nextInt();

      ArrayList<Student> arr=new ArrayList<Student>(nostu);
      
        for(int i=0;i<nostu;i++){
            arr.add(new Student(noSub));

               System.out.println("Enter marks for student "+ (i+1) );
            Student s=arr.get(i);
            s.TotalMarks();
            s.percentage();
            s.grade();
        }
         Iterator<Student> i=arr.iterator();
         int j=1;
         while(i.hasNext()){
            
            System.out.println("Student "+ j+"  ");
            System.out.println(i.next());
            System.out.println();
            j++;
         }
       
    }
   
}
