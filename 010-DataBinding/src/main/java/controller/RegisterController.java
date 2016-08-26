package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by STZHANGJK on 2016/8/26.
 */
@Controller
@RequestMapping("/prefix")
public class RegisterController {

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView doRegister(
            @RequestParam(value = "username",required = false,defaultValue = "admin") String username,
            @RequestParam(required = false,defaultValue = "123456") String password,
            @RequestParam(required = false,defaultValue = "123456") String passwordConfirm){
        System.out.println("doRegister");
        ModelAndView mv = new ModelAndView("register_success");
        mv.addObject("username",username);
        mv.addObject("password",password);
        mv.addObject("passwordConfirm",passwordConfirm);
        return mv;
    }
}
