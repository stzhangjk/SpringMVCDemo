package controller;

import DTO.RegisterDTO;
import org.springframework.web.servlet.mvc.SimpleFormController;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by STZHANGJK on 2016/8/24.
 */
public class RegisterFormController extends SimpleFormController {

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        RegisterDTO model = new RegisterDTO();
        model.setUsername("请输入用户名");
        model.setPassword("请输入密码");
        model.setPswConfirm("请重复密码");
        return model;
    }

    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map<String,Object> datas = new HashMap<>();
        datas.put("cityList", Arrays.asList("广州","汕头","厦门"));
        return datas;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        System.out.println(command);
        super.doSubmitAction(command);
    }
}
