package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bubul on 22-12-2017.
 */
@RestController
public class ClientController {
    @Value("${some.property:world}")
    private String myValue;
    @RequestMapping("/property")
    public String getValue(){
        return myValue;
    }

}
