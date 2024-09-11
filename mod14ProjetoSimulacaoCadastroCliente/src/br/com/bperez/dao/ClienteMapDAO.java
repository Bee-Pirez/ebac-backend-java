package br.com.bperez.dao;

import br.com.bperez.domain.Cliente;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO{
    //chave cpf do tipo long e valor vai ser o cliente
    private Map<Long, Cliente> map;

    //construtor
    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;

    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTelefone(cliente.getTelefone());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEndereco(cliente.getEndereco());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());

    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
