package projectloginclient.apicrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomizedResponseEntityExceptionHandler extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CustomizedResponseEntityExceptionHandler(String ex){
        super(ex);
    }

}
