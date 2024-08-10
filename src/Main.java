import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader cp= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // Creación del objeto
        Lista lista=new Lista();

        // Declaracion de variables
        boolean inSide=true;
        String lines="------------------------------------------------------------";

        // Menu
        while (inSide){
            System.out.println("Digite 1 para agregar un elemento al inicio de la lista");
            System.out.println("Digite 2 para agregar un elemento al final de la lista");
            System.out.println("Digite 3 para eliminar un elemento al inicio de la lista");
            System.out.println("Digite 4 para eliminar un elemento al final de la lista");
            System.out.println("Digite 5 para eliminar un elemento de la lista");
            System.out.println("Digite 6 para buscar un elemento de la lista");
            System.out.println("Digite 7 para mostrar la lista");
            System.out.println("Digite 8 para Salir");
            System.out.println(lines);
            int opcion=Integer.parseInt(cp.readLine());

            switch (opcion){

                case 1: // Agregar un elemento al inicio de la lista

                    System.out.println("digite el numero para agregar al inicio: ");
                    lista.agregarAlInicio(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;

                case 2: // Agregar un elemento al final de la lista

                    System.out.println("digite el numero para agregar al final: ");
                    lista.agregarAlFinal(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;

                case 3: // Eliminar un elemento al inicio de la lista

                    System.out.println("Se a eliminado el numero: "+ lista.eliminarAlInicio() + " de la lista");
                    System.out.println(lines);
                    break;

                case 4: // Eliminar un elemento al final de la lista

                    System.out.println("Se a eliminado el numero: "+ lista.eliminarAlFinal() + " de la lista");
                    System.out.println(lines);
                    break;

                case 5: // Eliminar un elemento de la lista

                    System.out.println("digite el numero que desea eliminar de la lista");
                    lista.borrarNodoEspecifico(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;

                case 6: // Buscar un elemento de la lista

                    System.out.println("digite el numero que desea buscar en la lista: ");

                    if (lista.buscarNodo(Integer.parseInt(cp.readLine()))){
                        System.out.println("Se a encontrado el numero");
                    }else {
                        System.out.println("No se a encontrado el numero");
                    }
                    System.out.println(lines);
                    break;

                case 7: // Mostrar la lista

                    lista.mostrarLista();
                    System.out.println();
                    System.out.println(lines);
                    break;

                case 8: // Salir

                    inSide=false;
                    break;

                default: // Si no se digita un numero correcto

                    System.out.println("ingreso un numero incorrecto");
                    System.out.println(lines);
            }
        }

    }
}