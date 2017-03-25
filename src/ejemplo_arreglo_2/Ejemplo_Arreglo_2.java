
package ejemplo_arreglo_2;

import javax.swing.JOptionPane;

public class Ejemplo_Arreglo_2 {

    public static void main(String[] args) {
        final int TAMANIO = 10;
        int num[] = new int[TAMANIO];
        
        rellenarArreglo(num); //llamada al metodo rellenarArreglo
        mostrarArreglo(num); //llamada al metodo mostarrArreglo
    }
    public static void rellenarArreglo(int lista[]){ //metodo
        for(int i=0; i<lista.length; i++){ // recorre el arreglo
            String text = JOptionPane.showInputDialog("introduce un Numero: ");
            lista[i]=Integer.parseInt(text); //se llena arreglo
        }
    }
    public static void mostrarArreglo(int lista[]){ //metodo
        for(int i=0; i<lista.length; i++){ // recorre el arreglo
            System.out.println("En el indice "+i+"esta el valor" +lista[i]);
        }
    }
    
}
