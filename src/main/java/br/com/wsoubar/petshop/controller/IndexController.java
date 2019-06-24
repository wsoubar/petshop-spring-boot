package br.com.wsoubar.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * IndexController
 */
@Controller
public class IndexController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("nome", "Wagner Barbosa");
        System.out.println("index!!");
        return "index";
    }

    @GetMapping(value="/index2")
    public String indexb() {
        return "index2";
    }
}