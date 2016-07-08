package mx.edu.itszapopan.vyv.data;

import java.util.ArrayList;

/**
 * Created by jesusgtz on 7/07/16.
 */
public class Pregunta {

    private String pregunta;
    private String ca;
    private String wa1;
    private String wa2;

    public Pregunta(String pregunta, String ca, String wa1, String wa2) {
        this.pregunta = pregunta;
        this.ca = ca;
        this.wa1 = wa1;
        this.wa2 = wa2;
    }

    public static ArrayList<Pregunta> getPreguntas() {
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

        preguntas.add(new Pregunta("¿Qué es Moprosoft?",
                "Un modelo para la evaluación de procesos de desarrollo y mantenimiento de software",
                "Un estándar de codificación", "Un estándar de la IEEE"));

        preguntas.add(new Pregunta("¿Quién desarrollo Moprosoft?",
                "La Asociación Mexicana para la Calidad en Ingeniería de Software", "La IEEE", "Oracle"));

        preguntas.add(new Pregunta("¿Cuál de los siguientes procesos corresponde a la categoría de alta dirección?",
                "Gestión de Negocio", "Gestión de Proyectos", "Desarrollo y Mantenimiento de Software"));

        preguntas.add(new Pregunta("¿Cuál de los siguientes procesos corresponde a la categoría de gerencia?",
                "Gestión de Procesos", "Gestión de Negociación", "Administración de Proyectos Específicos"));

        preguntas.add(new Pregunta("¿Cuál de los siguientes procesos corresponde a la categoría de operación?",
                "Desarrollo y Mantenimiento de Software", "Gestión de Recursos", "Gestión de Negocio"));

        preguntas.add(new Pregunta("¿Cuál es el objetivo del estándar IEEE 1008?", "Especificar un enfoque al testing de software",
                "Ayudar en la generación de estándares de codificación", "Establecer un modelo de ingeniería de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿qué ofrece el consenso de una unidad de pruebas?",
                "Una línea base para la evaluación de enfoques específicos", "Un conjunto de pruebas que evalúan los requerimientos",
                "Un conjunto de pruebas que evalúan el diseño"));

        preguntas.add(new Pregunta("¿Quienes son la audiencia del estándar IEEE 1008?", "Los testers y los supervisores de los testers",
                "Los líderes de proyectos", "Los desarrolladores de software"));

        preguntas.add(new Pregunta("¿Cuál es la función del estándar IEEE 829?", "Estándar para la documentación de pruebas de software",
                "Estándar para la inclusión de nuevos componentes al sistema", "Estándar para el control de la calidad"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuáles son las tres fases del proceso de pruebas?", "Realización del plan de pruebas, adquirir el conjunto de pruebas, medir la unidad de pruebas",
                "Diseñar el conjunto de pruebas, Refinar el plan general, Revisar la documentación", "Ejecutar pruebas, documentar software, generar reportes"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cómo se determina si la unidad de pruebas esta completa?",
                "Usa la unidad de diseño y la información de implementación, en adición a la unidad de requerimientos",
                "Usa técnicas que prueban la funcionalidad de todo el software", "Se lleva a cabo durante todas las fases del proyecto"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿dónde debe ser grabado el plan general de unidad de pruebas?",
                "En el correspondiente documento de planeación", "En el plan de proyecto", "En la documentación de requerimientos de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de los siguientes es uno de los pasos para determinar las características a ser probadas?",
                "Estudiar los requerimientos funcionales", "Revisar los diagramas de componentes", "Evaluar la necesidad de probar un elemento del sistema"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de los siguientes es uno de los pasos para refinar el plan general?",
                "Especificar solicitudes de recursos especiales", "Ajustar los tiempos según la cantidad de programadores",
                "Estudiar los requerimientos no funcionales"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de los siguientes es uno de los pasos para diseñar el conjunto de pruebas?",
                "Obtener especificaciones de casos de prueba", "Definir la arquitectura de software",
                "Seleccionar los componentes con viabilidad crítica"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de los siguientes es uno de los pasos para implementar el plan de diseño refinado?",
                "Obtener y verificar datos de pruebas", "Detener los servicios que puedan presentar irregularidades críticas",
                "Establecer una estrategia de integración continua"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de los siguientes es uno de los pasos para ejecutar procedimientos de pruebas?",
                "Correr pruebas", "Adquirir las unidades de procesamiento necesarias", "Estudiar la información de resumen inicial"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de las siguientes es una de las tareas de chequeo?",
                "Complementar el conjunto de pruebas", "Describir las estructuras de datos", "Terminar la documentación de requerimientos"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1008, ¿cuál de las siguientes es una de las tareas de evaluación?",
                "Describir estado de testeo", "Estudiar las especificaciones de diseño de pruebas",
                "Modificar la especificación de procedimientos de pruebas"));

        return preguntas;
    }
}
