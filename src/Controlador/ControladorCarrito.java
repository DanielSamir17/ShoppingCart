package controlador;

import Estructura.ListaDoble;
import Estructura.Nodo;
import Modelo.ItemCarrito;
import Modelo.Producto;


public class ControladorCarrito {
    private ListaDoble carrito = new ListaDoble();

    public void agregarAlCarrito(Producto p, int cantidad) {
        carrito.agregarFinal(new ItemCarrito(p, cantidad));
    }

    public boolean eliminarDelCarrito(String idProducto) {
        return carrito.eliminarPorId(idProducto);
    }

    public double calcularTotal() {
        double total = 0;
        Nodo aux = carrito.getInicio();
        while (aux != null) {
            if (aux.dato instanceof ItemCarrito item) {
                total += item.getSubtotal();
            }
            aux = aux.siguiente;
        }
        return total;
    }

    public ListaDoble getCarrito() {
        return carrito;
    }
}
