package GroupProject2;

public interface Marks {

    void getPercentage();

}

class StudentA implements Marks{
    private int STEMGrade;
    private int mathGrade;
    private int englishGrade;

    StudentA(int STEMGrade, int mathGrade, int englishGrade){
        this.STEMGrade = STEMGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public void getPercentage(){
        int average = (STEMGrade+ mathGrade +englishGrade)/3;
        System.out.println("The average mark of Student A is "+average);
    }

}

class StudentB implements Marks {
    private int STEMGrade;
    private int mathGrade;
    private int englishGrade;
    private int scienceGrade;

    StudentB(int STEMGrade, int mathGrade, int englishGrade, int scienceGrade) {
        this.STEMGrade = STEMGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public void getPercentage() {
        int average = (STEMGrade + mathGrade + englishGrade + scienceGrade) / 4;
        System.out.println("The average mark of Student B is " + average);
    }
}

class MarksTester{
    public static void main(String[] args) {
        Marks marksStudentA = new StudentA(95, 85, 99);
        marksStudentA.getPercentage();

        Marks marksStudentB = new StudentB(80, 90, 88, 96);
        marksStudentB.getPercentage();
    }
}


/*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
    three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
 */
