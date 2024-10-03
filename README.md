# Array-LinkedList

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
El primero de los algoritmos tiene un rendimiento que depende solamente de dos factores: El tamaño del arreglo y el número de desplazamientos dados por T. Por cada iteración del bucle interno se desplazan 4 elementos, el ultimo y penultimo de la primera mitad y el ultimo y penultimo de la segunda mitad, y por cada iteracion del bucle externo, se dan N/2 iteraciones del bucle interno, donde N es el tamaño del arreglo. En el caso del segundo algoritmo, la complejidad es de O(n^2), debido a que se utiliza un bucle anidado, cada uno de n iteraciones donde n es la cantidad de estudiantes totales. Utilizando un algoritmo mergeSort, se podría reducir la complejidad de este algoritmo a O(nlog(n)), debido a que progresivamente se romperia a mitad el tamaño de los arreglos utilizados para ordenar. 
