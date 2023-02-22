package grades;
import java.util.List;

class Student {

    private String name;

    private List<Double> grades;

//Constructor


    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

//Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

//Methods


    // adds the given grade to the grades property
    public void addGrade(double grade) {
            grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(double grade: grades){
           total += grade;

       }
        return total/grades.size();
    }

}
