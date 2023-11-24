package projectloginclient.apicrud.repository;


import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable  {

    private static final Long Serializable  = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nome_cliente",nullable = false, length = 80)
    private String nomeCliente;
    @Column(name = "email_cliente",nullable = false,length = 80)
    private String emailCliente;
    @Column(name = "endereco_cliente",nullable = false,length = 100)
    private String enderecoCliente;

    @Deprecated
    public Cliente(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nomeCliente, cliente.nomeCliente) && Objects.equals(emailCliente, cliente.emailCliente) && Objects.equals(enderecoCliente, cliente.enderecoCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCliente, emailCliente, enderecoCliente);
    }
}
