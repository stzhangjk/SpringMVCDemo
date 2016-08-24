package controller;


import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by STZHANGJK on 2016/8/24.
 */
public class RegisterFormController extends AbstractWizardFormController {
    protected Map referenceData(HttpServletRequest request, int page) throws Exception {
        Map map = new HashMap();
        switch (page){
            case 0:{
                map.put("cityList", Arrays.asList("广州","汕头","厦门"));
                break;
            }
            case 1:{
                map.put("schoolTypeList", Arrays.asList("高中", "中专", "大学"));
                break;
            }
            case 2:{
                map.put("cityList", Arrays.asList("济南", "北京", "上海"));
                break;
            }
        }
        return map;
    }

    /**
     * 提供每一页数据的验证处理方法
     * @param command
     * @param errors
     * @param page
     */
    protected void validatePage(Object command, Errors errors, int page) {

    }

    /**
     * 提供给每一页完成时的后处理方法
     * @param request
     * @param command
     * @param errors
     * @param page
     * @throws Exception
     */
    protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {

    }

    /**
     * 成功后的处理方法
     * @param request
     * @param response
     * @param command
     * @param errors
     * @return
     * @throws Exception
     */
    protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        System.out.println(command);
        return new ModelAndView("success");
    }

    /**
     * 取消后的处理方法
     * @param request
     * @param response
     * @param command
     * @param errors
     * @return
     * @throws Exception
     */
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        System.out.println(command);
        return new ModelAndView("cancel");
    }
}
