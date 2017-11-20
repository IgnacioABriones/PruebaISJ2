
import com.sun.java_cup.internal.runtime.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args ){
        ArrayList<Integer>array = leerValores();
        double suma = calcularSuma(array);
        double media = suma/array.size();
        mostrarResultados(array, suma, media);
    }
      
    //pedir por teclado los valores y guardarlos en el ArrayList
    public static ArrayList<Integer> leerValores()
    {
        Arraylist<Integer> valores = new Arraylist();
        Scanner entrada = new Scanner(System.in);
    }

}
