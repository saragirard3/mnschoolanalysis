package icu.girardtechie.mnschoolanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView Login(){
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }
}
