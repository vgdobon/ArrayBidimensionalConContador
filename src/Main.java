import java.util.Scanner;

//Crear un array de 3x3 de enteros, cada uno con el valor de su posición absoluta (0 1 2 / 3 4 5 / 6 7 8)
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres tu array");
        int filas = sc.nextInt();
        System.out.println("De cuantas columnas quieres tu array");
        int columnas = sc.nextInt();

        ArrayBidimensionalContador miObjeto = new ArrayBidimensionalContador(filas,columnas);

        miObjeto.rellenar();
        miObjeto.draw();
    }
}
