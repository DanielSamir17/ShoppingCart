
package Estructura;

public class NodoProducto {
    public Producto dato;
    public NodoProducto siguiente;

    public NodoProducto(Producto dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
