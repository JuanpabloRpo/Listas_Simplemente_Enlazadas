
public class Main {
    public static void main(String[] args) {
        Lista lista=new Lista();
        // agregar al inicio
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(7);
        lista.agregarAlInicio(10);
        lista.agregarAlInicio(4);
        lista.agregarAlInicio(50);

        lista.mostrarLista();
        System.out.println();
        System.out.println("------------------------");

        // agregar al final
        lista.agregarAlFinal(8);
        lista.agregarAlFinal(46);
        lista.agregarAlFinal(3);
        lista.agregarAlFinal(45);
        lista.agregarAlFinal(87);


        lista.mostrarLista();
        System.out.println();
        System.out.println("------------------------");

        // eliminar al inicio
        lista.eliminarAlInicio();

        lista.mostrarLista();
        System.out.println();
        System.out.println("------------------------");

        // eliminar al final
        lista.eliminarAlFinal();

        lista.mostrarLista();
        System.out.println();
        System.out.println("------------------------");

        // eliminal nodo especifico
        lista.borrarNodoEspecifico(10);

        lista.mostrarLista();
        System.out.println();
        System.out.println("------------------------");
    }
}