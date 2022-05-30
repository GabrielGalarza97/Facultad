package uc.as.p3.Main;

import uc.as.p3.Modelo.Cliente;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("C06458", "Gabriel Galarza", 500000);
        cliente.adicionarIva(10);
        cliente.imprimir();
    }

}
