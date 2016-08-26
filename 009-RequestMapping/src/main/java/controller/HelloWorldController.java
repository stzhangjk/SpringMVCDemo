package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    /**
     * 多个URL路径可以映射到同一个处理器的功能处理方法
     * @return
     */
    @RequestMapping({"/url1","/url2"})
    public ModelAndView multiMapping(){
        System.out.println("=======multiMapping()");
        return new ModelAndView("hello");
    }

    /**
     * URI模板模式映射
     * {×××}占位符
     * @param userId 占位符
     * @return
     */
    @RequestMapping("/urlTemplate/{userId}")
    public ModelAndView urlTemplate(@PathVariable("userId")String userId){
        System.out.println("userId = "  + userId);
        return new ModelAndView("url_template");
    }

    /**
     * Ant风格的URL路径映射
     * ? 一个字符
     * * 任意字符
     * ** 任意路径
     * 还可跟URL模板混用
     */
    @RequestMapping("/antURL/**")
    public ModelAndView antURL(){
        System.out.println("=======antURL");
        return new ModelAndView("antURL");
    }


    /**
     * 显示登录页面
     * 制定method属性
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        System.out.println("======login");
        return new ModelAndView("login");
    }

    /**
     * 执行登录操作
     * 制定method属性
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView doLogin(){
        System.out.println("======doLogin");
        return new ModelAndView("login_success");
    }
}
