package software.ulpgc;


import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvFileGradesLoader loader = new TsvFileGradesLoader(new File("grades.txt"));
        List<Double> grades = loader.loadGrades();
        //for (Grades grade : grades) {
          //  System.out.println("El estudiante con código " + grade.getNum_Estudiante() + " obtuvo un " + grade.getCalificacion() + " en la asignatura " + grade.getAsignatura());
        //}


    }
}

