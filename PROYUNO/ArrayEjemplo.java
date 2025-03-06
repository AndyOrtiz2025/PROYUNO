import java.util.Scanner;

public class ArrayEjemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int max = numeros[0], min = numeros[0], suma = 0;
        for (int num : numeros) {
            if (num > max) max = num;
            if (num < min) min = num;
            suma += num;
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("LOS RESULTADOS SON: ");
        System.out.println("Número mayor: " + max);
        System.out.println("Número menor: " + min);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    } 
}

