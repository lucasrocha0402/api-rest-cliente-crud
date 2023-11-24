package projectloginclient.apicrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectloginclient.apicrud.exceptions.CustomizedResponseEntityExceptionHandler;
import projectloginclient.apicrud.repository.Cliente;
import projectloginclient.apicrud.repository.ClienteRepository;


import java.util.List;
import java.util.logging.Logger;

@Service
public class ClienteService {

    private Logger logger = Logger.getLogger(ClienteService.class.getName());

    @Autowired
    ClienteRepository repository;

    public List<Cliente> findAll(){
        logger.info("Encontrou todas os clientes");

        return repository.findAll();
    }

    public Cliente findById(Long id){
        logger.info("Encontrou uma pessoa");

        return repository.findById(id)
                .orElseThrow(() -> new CustomizedResponseEntityExceptionHandler("Não foi possivel encontrar esse id"));
    }
    public Cliente create(Cliente cliente){
        logger.info("O cliente foi criado com sucesso");

        return repository.save(cliente);
    }
    public Cliente update(Cliente cliente){

        logger.info("O cliente foi atualizado com sucesso");

       var entity = repository.findById(cliente.getId())
                .orElseThrow(() -> new CustomizedResponseEntityExceptionHandler("Não foi possivel encontrar esse id"));

       entity.setNomeCliente(cliente.getNomeCliente());
       entity.setEmailCliente(cliente.getEmailCliente());
       entity.setEnderecoCliente(cliente.getEnderecoCliente());

        return repository.save(cliente);
    }
    public  void delete(Long id){

        logger.info("O cliente foi deletado com sucesso");

        var entity = repository.findById(id)
                .orElseThrow(() -> new CustomizedResponseEntityExceptionHandler("Não foi possivel encontrar esse id"));
        repository.delete(entity);
    }
}
