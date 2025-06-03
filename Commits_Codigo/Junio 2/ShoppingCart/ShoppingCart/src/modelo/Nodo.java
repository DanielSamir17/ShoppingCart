package modelo;

public class Nodo<T> {
    public T dato;
    public Nodo<T> sig, ant;

    public Nodo(T dato) {
        this.dato = dato;
        this.sig = this.ant = null;
    }
}
