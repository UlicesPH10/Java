package org.uph.poointerfaces;

import org.uph.poointerfaces.modelo.Cliente;
import org.uph.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzáles"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Gúzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("=".repeat(50));

        List<Cliente> paginable = repo.listar(0, 2);
        paginable.forEach(System.out::println);

        System.out.println("=".repeat(30) + "ordenar Ascendente" + "=".repeat(30));
        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("=".repeat(30) + "ordena Descendenter" + "=".repeat(30));
        List<Cliente> clientesOrdenDes = repo.listar("nombre", Direccion.DES);
        clientesOrdenDes.forEach(System.out::println);

        System.out.println("===================== editar =======================");
        Cliente beaActulizar = new Cliente("Bea", "Mena");
        beaActulizar.setId(2);

        repo.editar(beaActulizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("==============================================");
        repo.listar().forEach(System.out::println);
        System.out.println("========================  eliminar ======================");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("========================  Total Registros ======================");
        System.out.println(repo.total());


    }
}
