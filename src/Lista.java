

public class Lista {

    // Punteros para saber donde esta el inicio y el fin
    private Nodo inicio,fin;






    public Lista() {
        this.inicio=null;
        this.fin=null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }
    // Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){

        // Creando el nodo
        inicio=new Nodo(elemento,inicio);

        if(fin==null){
            fin=inicio;
        }

    }

    // Metodo para agregar un nodo al final de la lista
    public void agregarAlFinal(int elemento){

        // Creando el nodo
        if (!estaVacia()){
            fin.setSiguiente(new Nodo(elemento));
            fin=fin.getSiguiente();
        }else {
            inicio=fin=new Nodo(elemento);
        }

    }

    // Metodo para eliminar un nodo al inicio
    public int eliminarAlInicio() {
        int elemento =inicio.getDato();

        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.getSiguiente();
        }
        return elemento;
    }

    // Metodo para eliminar un nodo al final
    public int eliminarAlFinal() {
        int elemento =fin.getDato();


        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo temporal =inicio;
            while (temporal.getSiguiente()!=fin){
                temporal=temporal.getSiguiente();

            }
            fin=temporal;
            fin.setSiguiente(null);
        }
        return elemento;

    }

    // Borrar un nodo especifico
    public int borrarNodoEspecifico(int elemento){
        if (!estaVacia()){
            if (inicio==fin && elemento==inicio.getDato()){
                inicio = null;
                fin = null;
            } else if (inicio.getDato()==elemento) {
                inicio=inicio.getSiguiente();

            }else {

                Nodo anterior=inicio;
                Nodo temporal=inicio.getSiguiente();

                while (temporal!=null && temporal.getDato()!=elemento){
                    anterior=anterior.getSiguiente();
                    temporal=temporal.getSiguiente();
                }

                if (temporal!=null){
                    anterior.setSiguiente(temporal.getSiguiente());

                    if (temporal==fin){
                        fin=anterior;
                    }
                }

            }
        }

        return elemento;
    }

    // Buscar nodo
    public boolean buscarNodo(int elemento){
        Nodo temporal=inicio;
        while (temporal!=null && temporal.getDato()!=elemento){
            temporal=temporal.getSiguiente();
        }

        return temporal!=null;
    }

    public void mostrarLista(){
        Nodo recorrer=inicio;
        while (recorrer!=null){
            System.out.print("[ "+recorrer.getDato()+" ] ");
            recorrer=recorrer.getSiguiente();
        }
    }
}
