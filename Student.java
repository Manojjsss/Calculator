import java.time.*;

public class Student extends student_course_info
{  
    public static void main(String[] args)
    { 
        String stud_name = "Manoj";

        LocalDate pdt = LocalDate.of(2004,07,16);
        LocalDate tdt = LocalDate.now();
        Period diff = Period.between(pdt, tdt);        System.out.println("Name:" +stud_name);
        System.out.println("Date of Birth : "+pdt);
        System.out.println("Age : "+diff.getYears());
        System.out.println("Course and marks of semester 4:");
        student_course_info sc = new student_course_info();
        sc.stud_info();
            
    }
}
