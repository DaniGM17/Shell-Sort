import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dania
 */
public class ShellSort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] leerArreglo(int n) throws IOException {
        int[] a = new int[n];
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
        return a;
    }

    public static int[] shellSort(int[] listaD) { 
        boolean ordenar;
        for (int i = listaD.length/2; i>0; i/=2) {
            ordenar = true;
           while(ordenar){
               ordenar=false;
               for(int j=i;j<listaD.length; j++){
                   if(listaD[j-i]>listaD[j]){
                       int mant = listaD[j];
                       listaD[j] = listaD[j-i];
                       listaD[j-i] = mant;
                       ordenar = true;
                   }
               }
           }
        }
        return listaD;

    }
    
    public static void imprimirArreglo(int[] a) {
        System.out.println("-------------------------");
        System.out.println("Lista ordenada");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int[] array;
        int t;
        System.out.println("Programa que ordena la lista de números");
        System.out.println("Escribe la longitud de la lista a ingresar: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        array = leerArreglo(t);
        array = shellSort(array);
        imprimirArreglo(array);
    }
}