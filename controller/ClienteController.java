package projectloginclient.apicrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import projectloginclient.apicrud.repository.Cliente;
import projectloginclient.apicrud.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/lista",method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",
    method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente findById(@PathVariable(value = "id")Long id){
        return service.findById(Long.valueOf(id));
    }

    @RequestMapping(method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente create(@RequestBody Cliente cliente){
        return service.create(cliente);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente update(@RequestBody Cliente cliente){
        return service.update(cliente);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }

}
