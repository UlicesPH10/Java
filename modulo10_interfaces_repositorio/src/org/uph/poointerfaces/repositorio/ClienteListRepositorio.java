package org.uph.poointerfaces.repositorio;

import org.uph.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;

        for (Cliente cli : dataSource) {
            if (cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((Cliente o1, Cliente o2) -> {
            {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    resultado = ordenar(o1, o2, campo);
                } else if (dir == Direccion.DES) {
                    resultado = -ordenar(o1, o2, campo);
                }
                return resultado;
            }
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
    public static int ordenar(Cliente o1, Cliente o2, String campo) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = o1.getId().compareTo(o2.getId());
            case "nombre" -> resultado = o1.getNombre().compareTo(o2.getNombre());
            case "apellido" -> resultado = o1.getApellido().compareTo(o2.getApellido());
        }
        return resultado;
    }

}
