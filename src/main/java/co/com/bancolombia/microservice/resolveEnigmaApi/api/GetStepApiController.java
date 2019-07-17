package co.com.bancolombia.microservice.resolveEnigmaApi.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.bancolombia.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.bancolombia.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-17T08:28:42.849-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {

    private static final Logger log = LoggerFactory.getLogger(GetStepApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyResponseSuccess> getStep(@ApiParam(value = "request body get enigma step" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyResponseSuccess>(objectMapper.readValue("{\n" + 
                		"  \"data\" : [ {\n" + 
                		"    \"answer\" : \"answer\",\n" + 
                		"    \"header\" : {\n" + 
                		"      \"id\" : \"id\",\n" + 
                		"      \"type\" : \"type\"\n" + 
                		"    }\n" + 
                		"  }, {\n" + 
                		"    \"answer\" : \"answer\",\n" + 
                		"    \"header\" : {\n" + 
                		"      \"id\" : \"id\",\n" + 
                		"      \"type\" : \"type\"\n" + 
                		"    }\n" + 
                		"  } ]\n" + 
                		"}", JsonApiBodyResponseSuccess.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
