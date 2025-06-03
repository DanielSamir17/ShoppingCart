
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import modelo.Nodo;
import modelo.Usuario;

public class PilaUsuarios {

    Nodo<Usuario> tope;

    public PilaUsuarios() {
        tope = null;
    }

    public boolean getEsVacia() {
        return tope == null ? true : false;
        /*
            if(tope==null)
                return true;
            else
                return false;
         */
    }

    public Nodo<Usuario> getBase() {
        if (getEsVacia()) {
            return null;
        } else {
            Nodo<Usuario> p = tope;
            while (p.sig != tope) {
                p = p.sig;
            }
            return p;
        }
    }

    public void aggUsuario(String usuario, String contra) {
        Usuario user = new Usuario(usuario, contra);
        Nodo<Usuario> nuevoNodo = new Nodo(user);

        if (getEsVacia()) {
            tope = nuevoNodo;
            tope.sig = tope;
        } else {
            nuevoNodo.sig = tope;
            Nodo<Usuario> ultimo = getBase();
            ultimo.sig = nuevoNodo;
            tope = nuevoNodo;
        }
    }

    public boolean validacion(String usuario, String contra) {
        if (getEsVacia()) {
            return false;
        }
        Nodo<Usuario> p = tope;
        usuario = usuario.trim();
        contra = contra.trim();
        do {
            if (p.dato.user.equals(usuario) && p.dato.contra.equals(contra)) {
                return true;
            }
            p = p.sig;
        } while (p != tope);
        return false;
    }

    public Usuario obtenerUsuario(String usuario, String contra) {
        if (getEsVacia()) {
            return null;
        }

        Nodo<Usuario> p = tope;
        usuario = usuario.trim();
        contra = contra.trim();

        do {
            if (p.dato.user.equals(usuario) && p.dato.contra.equals(contra)) {
                return p.dato;
            }
            p = p.sig;
        } while (p != tope);

        return null;
    }

    public void actualizarUsuario(Usuario usuario) {
        Nodo<Usuario> temp = tope;
        if (temp == null) {
            return;
        }
        do {
            if (temp.dato.user.equals(usuario.user)) {
                temp.dato = usuario;
                break;
            }
            temp = temp.sig;
        } while (temp != tope);
    }

    public void guardarUsuariosEnArchivo() {
        try {
            File carpeta = new File("src/ArchivoTexto");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            File archivo = new File(carpeta, "usuarios.txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                if (!getEsVacia()) {
                    Nodo<Usuario> temp = tope;
                    do {
                        Usuario u = temp.dato;
                        writer.write(u.user+","+u.contra);
                        writer.newLine();
                        temp = temp.sig;
                    } while (temp != tope);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarUsuariosDesdeArchivo() {
        File carpeta = new File("src/ArchivoTexto"); // Añade esta línea para definir la carpeta
        File archivo = new File(carpeta, "usuarios.txt"); // Asegura que la ruta sea la misma que en guardarUsuariosEnArchivo

        if (!archivo.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String user = partes[0];
                    String contra = partes[1];
                    aggUsuario(user, contra);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
