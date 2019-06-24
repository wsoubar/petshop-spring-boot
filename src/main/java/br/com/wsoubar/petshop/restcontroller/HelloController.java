package br.com.wsoubar.petshop.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wsoubar.petshop.service.HelloService;
import br.com.wsoubar.petshop.vo.HelloVO;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @Autowired
    HelloService service;

    //private static final String template = "Hello, %s!";

    @RequestMapping(value="/hello/{nome}/{idade}", 
        method = RequestMethod.GET,
        produces = "application/json")
    public HelloVO helloWorld(@PathVariable String nome, @PathVariable int idade) {
        System.out.println("helloWorld method!");
        HelloVO vo = service.getHello(nome, idade);
        return vo;
    }
    
}