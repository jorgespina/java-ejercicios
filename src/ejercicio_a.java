import java.util.Scanner;

public class ejercicio_a {
/*
a) Recibir una nota numérica entera entre 0 y IO, y regresar dicha nota de la forma de cadena: cero, uno, dos, tres, etc.
en minúsculas, si el número no está entre esos rangos regresar la cadena incorrecto.
b) Recibir 2 números enteros y regresar el menor de estos si son iguales regresar cualquiera.
c) Recibir el día y mes, regresar true si la fecha es correcta o false si no lo es. Suponiendo que todos los meses son de 30 días.
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese nota (entre 0 y 10): ");
        int nota = input.nextInt();

        switch(nota) {
            case 0:
                System.out.println("La nota ingresada fue CERO");
                break;
            case 1:
                System.out.println("La nota ingresada fue UNO");
                break;
            case 2:
                System.out.println("La nota ingresada fue DOS");
                break;
            case 3:
                System.out.println("La nota ingresada fue TRES");
                break;
            case 4:
                System.out.println("La nota ingresada fue CUATRO");
                break;
            case 5:
                System.out.println("La nota ingresada fue CINCO");
                break;
            case 6:
                System.out.println("La nota ingresada fue SEIS");
                break;
            case 7:
                System.out.println("La nota ingresada fue SIETE");
                break;
            case 8:
                System.out.println("La nota ingresada fue OCHO");
                break;
            case 9:
                System.out.println("La nota ingresada fue NUEVE");
                break;
            case 10:
                System.out.println("La nota ingresada fue DIEZ");
                break;
            default:
                System.out.println("Error: La nota ingresada no está en el rango de 0 a 10.");
        }

    }


}
