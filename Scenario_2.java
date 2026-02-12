import java.util.ArrayList;
class Student{
    String name;
    public ArrayList<Double> grades;
    Student(String name){
        this.name=name;
        this.grades = new ArrayList<Double>();
    }
    
    public void addGrade(double grade)
    {
        grades.add(grade);
    }
    public double calculateAverage()
    {
        Double sum=0.0;
        for(Double g : grades) 
            { sum+=g; } 
        return sum/grades.size();
    }
    public void displayStudentDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Grades: "+this.grades);
        System.out.println("Average: "+calculateAverage());
    }
}

class GradeManager extends Student{

    GradeManager() {
        super(null);
    }
    
    private ArrayList<Student> students=new ArrayList<Student>(); //imp to initialize the ArrayList otherwise it will throw NullPointerException when we try to add students to it.
    public void addStudent(Student student)
    {   
        students.add(student);
    }
    public Student findStudentByName(String name)
    {
        for(Student s : students)
        {
            if(s.name.equals(name))
            {
                System.out.println("Student found: " + s.name); s.displayStudentDetails();
                return s;
            }
        }
        System.out.println("Student not found");
        return null;
    }
    public void displayAllStudents()
    {
        for(Student s : students)
        {
            s.displayStudentDetails();
            System.out.println("-------------");
        }
    }
}

public class Scenario_2{
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        Student s1 = new Student("Alice");
        s1.addGrade(85);
        s1.addGrade(90);
        manager.addStudent(s1);
        manager.findStudentByName("Alice");
        //manager.displayAllStudents();
    }
}