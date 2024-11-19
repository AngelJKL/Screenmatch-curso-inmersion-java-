import java.util.Scanner;

public class screenmatch {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en java");
        // System.out.println("Pelicula Matrix");

        // variables

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;

        String nombre = "Matrix";
        String sinopsis = "la mejor pelicula";
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular del momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le darias a esta pelicula");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("la media de la pelicula" +
                "Matrix calculada por el usuario es:" + mediaEvaluacionUsuario / 3);
    }

}