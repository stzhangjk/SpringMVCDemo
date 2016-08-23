package controller;

import model.UserModel;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by STZHANGJK on 2016/8/23.
 */

public class TestCommandController extends AbstractCommandController {
    @Override
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object object, BindException e) throws Exception {
        ModelAndView mv = new ModelAndView();
        UserModel user = (UserModel)object;
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        mv.addObject("user",object);
        mv.setViewName("hello");
        return mv;
    }
}
