package com.dimkonko.jdictserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView hello(ModelMap model) {
        ModelAndView mv = new ModelAndView("hello");
        model.addAttribute("title", "Welcome");
        model.addAttribute("msg", "Some MV msg");
        return mv;
    }
}
