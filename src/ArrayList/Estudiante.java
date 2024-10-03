package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    int matricula;
    String nombre;
    double indiceAcademico;

    @Override
    public String toString() {
        return matricula + " - " + nombre + " - " + String.format("%.2f", indiceAcademico);
    }

    public static List<Estudiante> ordenarMergeSort(List<Estudiante> listaSinOrdenar, boolean ascendente) {
        if(listaSinOrdenar.size() <= 1) {
            return listaSinOrdenar;
        }

        for(int i = 0; i < listaSinOrdenar.size(); i++) {
            for(int j = 0; j < listaSinOrdenar.size(); j++) {
                if(listaSinOrdenar.get(i).indiceAcademico < listaSinOrdenar.get(j).indiceAcademico && ascendente ||
                        listaSinOrdenar.get(i).indiceAcademico > listaSinOrdenar.get(j).indiceAcademico && !ascendente) {
                    Estudiante temp = listaSinOrdenar.get(i);
                    listaSinOrdenar.set(i, listaSinOrdenar.get(j));
                    listaSinOrdenar.set(j, temp);
                }
            }
        }

        return listaSinOrdenar;
    }


    public static ArrayList<Estudiante> GenerarEstudiante(int N) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            Estudiante estudiante = new Estudiante();
            estudiante.matricula = (int)(Math.random() * 1000);
            estudiante.nombre = "Martha Beato <3 " + i;
            estudiante.indiceAcademico = Math.random() * 4;
            listaEstudiantes.add(estudiante);
        }
        return listaEstudiantes;
    }

}
