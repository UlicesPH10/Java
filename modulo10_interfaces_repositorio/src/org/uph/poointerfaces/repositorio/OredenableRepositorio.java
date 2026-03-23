package org.uph.poointerfaces.repositorio;

import org.uph.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OredenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
