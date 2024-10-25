import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int puntosHermano = 40;
        final int puntosZona = 30;
        final int puntosFamiliar = 5;
        final int puntosFamiliaNumerosa = 15;
        final int puntosDiscapacidad = 10;
        final int puntosTrabajoZona = 20;
        int puntos = 0;

        System.out.println("Introduzca el número de expediente del alumno : ");
        int numeroExpediente = sc.nextInt();

        // Validar el número de expediente
        while (numeroExpediente < 1 || numeroExpediente > 499) {
            System.out.println("Número de expediente incorrecto, por favor, introduzca un numero entre 1 y 499 : ");
            numeroExpediente = sc.nextInt();
        }


        puntos += preguntarPuntos(sc, "¿Tiene algún hermano en el centro?", puntosHermano);
        puntos += preguntarPuntos(sc, "¿Vive en la misma población que la escuela?", puntosZona);
        puntos += preguntarPuntos(sc, "¿El padre, madre, tutor o hermano ha sido escolarizado en la misma escuela?", puntosFamiliar);
        puntos += preguntarPuntos(sc, "¿Forma parte de una familia numerosa o monoparental?", puntosFamiliaNumerosa);
        puntos += preguntarPuntos(sc, "¿Tiene discapacidad igual o superior al 33% o enfermedad crónica?", puntosDiscapacidad);
        puntos += preguntarPuntos(sc, "¿El padre o madre trabaja en la misma población que la escuela?", puntosTrabajoZona);

        System.out.println("El niño con expediente " + numeroExpediente + " tiene " + puntos + " puntos.");

        sc.close(); // Cerrar el escáner
    }

    // Función para hacer preguntas y sumar puntos
    public static int preguntarPuntos(Scanner sc, String pregunta, int puntosPorRespuestaPositiva) {
        System.out.print(pregunta + " (0: no / 1: sí): ");
        int respuesta = sc.nextInt();

        // Validar que la respuesta sea 0 o 1
        while (respuesta != 0 && respuesta != 1) {
            System.out.println("Respuesta incorrecta, Introduzca 0 o 1: ");
            respuesta = sc.nextInt();
        }


        return (respuesta == 1) ? puntosPorRespuestaPositiva : 0;
    }
}


