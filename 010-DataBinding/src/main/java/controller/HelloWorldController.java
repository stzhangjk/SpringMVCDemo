package controller;

import model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
@RequestMapping("/prefix")
public class HelloWorldController{

    /**
     *
     * @param request 自动注入request
     * @param response 自动注入response
     * @param session 自动注入session，永远不为null
     *                注意：session访问不是线程安全的，
     *                如果需要线程安全，需要设置AnnotationMethodHandlerAdapter
     *                或RequestMappingHandlerAdapter的synchronizeOnSession属性为true，
     *                即可线程安全的访问session。
     * @return
     */
    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response,HttpSession session){
        System.out.println(request);
        System.out.println(response);
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello world!");
        mv.setViewName("hello");
        return mv;
    }

    /**
     * 显示登录页面
     * 制定method属性
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        System.out.println("======login");
        return "login";
    }


    /**
     * （Model model, Map model2, ModelMap model3）都是同一个BindingAwareModelMap实例
     * @param loginModel 命令对象
     * @param model1 暴露渲染视图需要的模型数据
     * @param model2 暴露渲染视图需要的模型数据
     * @param model3 暴露渲染视图需要的模型数据
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(LoginModel loginModel, Model model1, ModelMap model2, Map model3){
        System.out.println(loginModel);
        System.out.println("======doLogin");
        model1.addAttribute("login",loginModel);
        return "login_success";
    }
}
