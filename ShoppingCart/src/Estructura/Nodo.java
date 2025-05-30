
package Estructura;

public class Nodo {
    public Object dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
