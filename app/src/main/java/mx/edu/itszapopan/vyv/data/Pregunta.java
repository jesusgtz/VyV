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

        return preguntas;
    }
}
