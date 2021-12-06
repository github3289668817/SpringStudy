package per.xgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import per.xgt.pojo.SSMUser;
import per.xgt.service.SSMUserService;

import java.util.Map;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/12/6 14:21
 */
@Controller
public class SSMUserController {

    @Autowired
    private SSMUserService ssmUserService;

    @RequestMapping("/findOneById")
    public String persons(Map<String,Object> map, ModelAndView modelAndView){
        SSMUser user = ssmUserService.findOneById(2);
        map.put("user", user);
        return "ssmUser";
    }

}
