package com.aakbulak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
@Controller
public class AppController {
    @RequestMapping("/")
    String home(ModelMap modal){
        return "index";
    }

    @RequestMapping("/partials/{page}")
    String partialHandler(@PathVariable("page") final String page) {
        return page;
    }
}
