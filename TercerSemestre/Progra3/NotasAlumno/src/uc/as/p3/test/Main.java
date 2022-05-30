package uc.as.p3.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import uc.as.p3.modelo.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        cargarDatos(usuario);

        try {
            almacenar(usuario);
            System.out.println("Usuario leido: " + leerUsuario());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void cargarDatos(Usuario usuario) {
        usuario.agregarMateria("Programacion 3");
        usuario.agregarMateria("Programacion 3");
        usuario.agregarMateria("Programacion 3");
        usuario.agregarMateria("Programacion 3");
        usuario.agregarMateria("Programacion 3");
        usuario.setNota(0, 10);
        usuario.setNota(1, 9);
        usuario.setNota(2, 7);
        usuario.setNota(3, 5);
        usuario.setNota(4, 6);
    }

    public static void almacenar(Usuario usuario) throws IOException {
        FileOutputStream fos = new FileOutputStream("usuario.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(usuario);
        oos.close();
    }

    public static Usuario leerUsuario() throws IOException, ClassNotFoundException {
        Usuario usuario = null;
        FileInputStream fis = new FileInputStream("usuario.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuario = (Usuario) ois.readObject();
        ois.close();

        return usuario;
    }
}
