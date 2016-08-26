package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/prefix")
public class HelloWorldController{

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello world!");
        mv.setViewName("hello");
        return mv;
    }
}
