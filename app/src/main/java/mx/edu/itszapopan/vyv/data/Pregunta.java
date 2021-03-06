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

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getWa1() {
        return wa1;
    }

    public void setWa1(String wa1) {
        this.wa1 = wa1;
    }

    public String getWa2() {
        return wa2;
    }

    public void setWa2(String wa2) {
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

        preguntas.add(new Pregunta("¿Cuál es el alcance del estándar IEEE 829?", "Aplica a todos los sistemas basados en software",
                "Aplica para todas las empresas que utilizan software", "Aplica a todos los involucrados en el desarrollo de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 829, ¿cuáles son todos los componentes del software?",
                "Entorno, usuarios, hardware, otro software", "Modelo, controladores y vistas", "Backend, frontend y UX"));

        preguntas.add(new Pregunta("¿Cuál es el objetivo del estándar IEEE 829?", "Establecer un marco de trabajo común para los procesos de pruebas",
                "Establecer las especificaciones de una unidad de pruebas", "Medir el nivel de madurez que tiene un proceso de desarrollo de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 829, ¿cuál es la descripción del nivel 4 de integridad del software?",
                "El software debe ejecutarse correctamente o graves consecuencias podrían ocurrir",
                "El software debe ejecutarse correctamente o el uso previsto no podría ser alcanzado",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias menores"));

        preguntas.add(new Pregunta("Según el estándar IEEE 829, ¿cuál es la descripción del nivel 3 de integridad del software?",
                "El software debe ejecutarse correctamente o el uso previsto no podría ser alcanzado",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias menores",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias imperceptibles"));

        preguntas.add(new Pregunta("Según el estándar IEEE 829, ¿cuál es la descripción del nivel 2 de integridad del software?",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias menores",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias imperceptibles",
                "El software debe ejecutarse correctamente o graves consecuencias podrían ocurrir"));

        preguntas.add(new Pregunta("Según el estándar IEEE 829, ¿cuál es la descripción del nivel 1 de integridad del software?",
                "El software debe ejecutarse correctamente o una función esperada podría causar consecuencias imperceptibles",
                "El software debe ejecutarse correctamente o graves consecuencias podrían ocurrir",
                "El software debe ejecutarse correctamente o el uso previsto no podría ser alcanzado"));

        preguntas.add(new Pregunta("¿De qué otro estándar se apoya el estándar IEEE 829 para describir procesos?",
                "IEEE 12207", "IEEE 1012", "IEEE 1028"));

        preguntas.add(new Pregunta("¿En qué consiste el estándar IEEE 1012?", "En la especificación de procesos de verificación y validación de software",
                "En las metodologías para medir la madurez del software", "En los procesos para la recolección efectiva de requerimientos"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, los requerimientos de los procesos del ciclo de vida de la verificación y validación de software son especificados por:",
                "Diferentes niveles de integridad", "La unión de todos los componentes del sistema",
                "Es estándar IEEE 830"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿qué muestra la valoración objetiva de los productos de software y procesos a lo largo de todo el ciclo de vida?",
                "Si los requerimientos del software y del sistema son correctos, completos, precisos, consistentes y testeables",
                "Si la documentación del software y del sistema es suficiente",
                "Si el equipo de desarrollo cuenta con un modelo de desarrollo de software adecuado"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿en qué consiste el feedback?",
                "En la resolución de anomalías, mejoras de ejecución y mejoras de la calidad no solo para las condiciones de ejecución esperadas",
                "En una reunión breve de 15 minutos con todos los desarrolladores del proyecto",
                "En una revisión exhaustiva de los avances realizados hasta el momento"));

        preguntas.add(new Pregunta("¿Cuál de las siguientes opciones es un objetivo del estándar IEEE 1012?",
                "Identificar las tareas mínimas de Verificación y Validación correspondientes a los cuatro niveles de integridad",
                "Ayudar a los desarrolladores a entender la importancia de la documentación de software",
                "Llevar un proceso de pruebas al paralelo del proceso de desarrollo de software"));

        preguntas.add(new Pregunta("¿Cuál es el alcance del estándar IEEE 1012?",
                "Abarca sistemas basados en software, hardware e interfaces",
                "Para los testers y los supervisores de los testers",
                "Para todos los proyectos que apliquen procesos de Aseguramiento de la Calidad"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿qué provee la Verificación?",
                "Evidencia objetiva del software, de sus productos asociados y procesos",
                "Revisiones documentadas en checklists",
                "Un enfoque técnico de lo redactado en los requerimientos funcionales"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿qué certifica la Validación?",
                "Que se cumple con el uso esperado y las necesidades del usuario son cubiertas",
                "Que se completa exitosamente el proceso de desarrollo de software",
                "Que la implementación del plan de desarrollo fue exitosa"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿cuál de los siguientes es uno de los pasos del proceso de administración?",
                "Preparar el plan para la ejecución de procesos",
                "Adquirir los recursos físicos necesarios para trabajar",
                "Separar la totalidad del proyecto en módulos más pequeños y manejables"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿cuál de los siguientes es uno de los pasos del proceso de adquisición?",
                "Definir las necesidades para conseguir un sistema, producto de software o servicio de software",
                "Checar los procesos de eficiencia y efectividad",
                "Desarrollar interfaces para integrar las adquisiciones"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿cuál de los siguientes es uno de los pasos del proceso de abastecimiento?",
                "Se inicia con la decisión de preparar una propuesta para responder a la solicitud de un adquiriente",
                "La ejecución de pruebas de aceptación e instalación",
                "Instalación y soporte para la aprobación de los productos de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿qué contiene el proceso de desarrollo?",
                "Las actividades y tareas pertenecientes al desarrollador",
                "Los procesos operativos para la adherencia con el uso previsto",
                "Las actividades de planeación"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿cuál de los siguientes es uno de los pasos del proceso de operación?",
                "Involucrar el uso de sistemas de software para el usuario final dentro de un entorno operacional",
                "Actuar sobre cada una de las actividades",
                "Establecer las modificaciones que son necesarias para el buen funcionamiento del sistema"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1012, ¿cuándo se activa el proceso de mantenimiento?",
                "Cuando el sistema de software y la documentación asociada se deben cambiar en respuesta a una necesidad de mantenimiento del sistema",
                "Cuando se han evaluado las restricciones del sistema",
                "Cuando el desarrollador lo considera pertinente"));

        preguntas.add(new Pregunta("¿Cuál es el propósito del estándar IEEE 1028?",
                "Definir revisiones y auditorías sistemáticas aplicables a la adquisición, suministro, desarrollo, operación y mantenimiento de software",
                "Definir los niveles de integridad del software",
                "Definir los procesos de aseguramiento de la calidad de software"));

        preguntas.add(new Pregunta("¿Cuántos tipos de revisión tiene el estándar IEEE 1028?",
                "5", "3", "4"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1028, ¿cuál es el propósito de las revisiones de la gestión?",
                "Monitorear el progreso, determinar el estado de los planes y horarios, o evaluar la eficacia de los enfoques de gestión utilizados",
                "Determinar las utilidades generadas tras el ejercicio de las operaciones del negocio",
                "Diagnosticar problemáticas que dificulten el buen aprovechamiento de los recursos de la empresa"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1028, ¿cuál es el propósito de las revisiones técnicas?",
                "Evaluar un producto de software por un equipo de personal calificado para determinar su idoneidad para el uso previsto",
                "Para evaluar que la unión entre los distintos componentes del sistema es compatible",
                "Para evaluar las tecnologías que se deben aplicar en el proyecto"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1028, ¿cuál es el propósito de la inspección?",
                "Detectar e identificar anomalías de productos de software",
                "Asegurarse de que el producto de software cumple con estándares internacionales",
                "Comprobar que el modelo de negocios es el adecuado para implementar un producto de software"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1028, ¿cuál de los siguientes es uno de los objetivos principales de un recorrido sistemático?",
                "Evaluar la usabilidad y la accesibilidad del producto de software",
                "Recabar datos de anomalías",
                "Documentar quejas de clientes o usuarios representativos"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1028, ¿cuál es el propósito de una auditoría de software?",
                "Proporcionar una evaluación de la conformidad con el software, productos y procesos a los reglamentos aplicables, normas, directrices, planes y especificaciones",
                "Documentar defectos en el software",
                "Considerar implementaciones alternativas"));

        preguntas.add(new Pregunta("¿Qué define el estándar IEEE 1044?",
                "Un proceso para clasificar anomalías de software y su documentación al identificarse en cualquier fase del ciclo de vida",
                "Un modelo de desarrollo orientado a resultados",
                "Un proceso de automatización de pruebas unitarias"));

        preguntas.add(new Pregunta("¿Quiénes representan la audiencia del estándar IEEE 1044?",
                "Los desarrolladores, adquirientes, usuarios y evaluadores",
                "Los directivos de la organización",
                "Cualquier empresa con calidad en sus procesos"));

        preguntas.add(new Pregunta("¿Cuál es el alcance del estándar IEEE 1044?",
                "Definir un enfoque unificado para clasificar anomalías encontradas en el software y su documentación",
                "Solucionar las anomalías encontradas en la fase de planeación",
                "Establecer estándares de codificación internos para los desarrolladores"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1044, ¿cuáles son los pasos para identificar una anomalía?",
                "Reconocimiento, investigación, medición y disposición",
                "Testing, documentación, revisión y corrección",
                "Depende de la fase en la que se encontró la anomalía"));

        preguntas.add(new Pregunta("Según el estándar IEEE 1044, ¿cuáles son las actividades que se llevan a cabo durante todo el proceso?",
                "Registrar, clasificar e identificar impacto",
                "Testear, documentar y corregir",
                "Depende de la arquitectura que tenga el software"));

        return preguntas;
    }
}
