import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        calcularResistencia();
    }

    public static void calcularResistencia(){


    System.out.println("Ingrese recistencia 1: ");
    Scanner resistencia1 = new Scanner(System.in);

    Scanner recistencia1 = new Scanner(System.in);
    int R1 = recistencia1.nextInt();
    
    System.out.println("Ingrese recistencia 2: ");
    Scanner resistencia2 = new Scanner(System.in);
    
    int R2 = resistencia2.nextInt();

    Scanner resistencia3 = new Scanner(System.in);
    System.out.println("Ingrese recistencia 3: ");

    int R3 = resistencia3.nextInt();

    float resistenciaTotal = 1f/((1f/R1)+(1f/R2)+(1f/R3));

        System.out.println("La resistencia total es de: " + resistenciaTotal);
    }

}


