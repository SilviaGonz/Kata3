package software.ulpgc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvFileGradesLoader {
    private final File file;

    public TsvFileGradesLoader(File file) {
        this.file = file;
    }

    public List<Double> loadGrades() {
        List<Double> grades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] columns = line.split("\t");
                grades.add(Double.parseDouble(columns[1]));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return grades;
    }
}
