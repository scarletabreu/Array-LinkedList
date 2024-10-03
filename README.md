﻿# Array-LinkedList

 -- Descripción del programa --

 El programa tiene dos paquetes [Array] y [ArrayList]. El primer el paquete [Array] tiene la clase del primer ejercicio, el cual consiste de dado un Arreglo A de N elementos y un número T par, hacer un algorítmo de ordenamiento que desplace los N elementos del arreglo A desde el medio con los elementos en la posiciones n-t a la izquierda y la derecha. En el Paquete [ArrayList] tiene la clase del segundo ejercicio, el cual consiste en ordenar una lista grande de estudiantes dependiendo su índice académico de manera ascendente o descendiente, indicado por un parametro.

 -- Instrucciones para compilar --

  Dentro del proyecto y fuera de los paquetes existe una clase main, la cual ya tiene valores de prueba y solo debe ser ejecutada.

 -- Valores de prueba -- 

       Object [] arreglini = new Object[]{"Prueba", "Código", "Java", 1987, "Alejandro", "Liz", 2024, "Ruby"};
       movNTimes(arreglini, 3);
       printArray(arreglini);

      ArrayList<Estudiante> listaPrueba = Estudiante.GenerarEstudiante(10);
      System.out.println("Lista sin ordenar");
      printArray(listini.toArray());
      
      System.out.println("Lista ordenada ascendente");
      printArray(Estudiante.ordenarMergeSort(listini, true).toArray());
      
      System.out.println("Lista ordenada descendiente");
      printArray(Estudiante.ordenarMergeSort(listini, false).toArray());

-- Análisis del rendimiento en función del número de procesos utilizados --
