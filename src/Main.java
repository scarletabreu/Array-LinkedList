import static Array.Array.*;
import ArrayList.Estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Object [] arreglini = new Object[]{"Hola", "Mundo", "Queso", 1987, "Alejandro", "Liz", 2021, "Ruby"};

         movNTimes(arreglini, 3);
         printArray(arreglini);

        ArrayList<Estudiante> listini = Estudiante.GenerarEstudiante(10);
        System.out.println("Lista sin ordenar");
        printArray(listini.toArray());
        System.out.println("Lista ordenada ascendente");
        printArray(Estudiante.ordenarMergeSort(listini, true).toArray());
        System.out.println("Lista ordenada descendiente");
        printArray(Estudiante.ordenarMergeSort(listini, false).toArray());

    }
}