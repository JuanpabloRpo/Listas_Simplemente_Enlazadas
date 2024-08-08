import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader cp= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Lista lista=new Lista();
        boolean inSide=true;
        String lines="------------------------------------------------------------";
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
                case 1:
                    System.out.println("digite el numero para agregar al inicio: ");
                    lista.agregarAlInicio(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;
                case 2:
                    System.out.println("digite el numero para agregar al final: ");
                    lista.agregarAlFinal(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;
                case 3:
                    System.out.println("Se a eliminado el numero: "+ lista.eliminarAlInicio() + " de la lista");
                    System.out.println(lines);
                    break;
                case 4:
                    System.out.println("Se a eliminado el numero: "+ lista.eliminarAlFinal() + " de la lista");
                    System.out.println(lines);
                    break;
                case 5:
                    System.out.println("digite el numero que desea eliminar de la lista");
                    lista.borrarNodoEspecifico(Integer.parseInt(cp.readLine()));
                    System.out.println(lines);
                    break;
                case 6:
                    System.out.println("digite el numero que desea buscar en la lista: ");

                    if (lista.buscarNodo(Integer.parseInt(cp.readLine()))){
                        System.out.println("Se a encontrado el numero");
                    }else {
                        System.out.println("No se a encontrado el numero");
                    }
                    System.out.println(lines);
                    break;
                case 7:
                    lista.mostrarLista();
                    System.out.println();
                    System.out.println(lines);
                    break;
                case 8:
                    inSide=false;
                    break;
                default:
                    System.out.println("ingreso un numero incorrecto");
                    System.out.println(lines);
            }
        }

    }
}