package per.xgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.xgt.domain.User;
import per.xgt.domain.VO;

import java.util.Arrays;

/**
 *
 * @author Valen
 * @version V1.0
 * @date 2021/9/14 16:25
 */
@Controller
public class User2Controller {

    /**
     * 基本数据类型
     * Controller中的业务方法的参数名称要与请求参数的name一直，参数值会自动映射匹配
     * @param username
     * @param age
     */
    @RequestMapping("/user1")
    @ResponseBody
    public void user1(String username,int age) {
        System.out.println("username:"+username+",age:"+age);
    }

    /**
     * pojo数据类型
     * POJO参数的属性名与请求参数的name一直，参数值会自动映射匹配
     * @param user
     */
    @RequestMapping("/user2")
    @ResponseBody
    public void user2(User user) {
        System.out.println(user.getUsername()+"----"+user.getAge());
    }

    /**
     * 数组数据类型
     * 数组参数的数组名称与请求参数的name一直，参数值会自动映射匹配
     * @param strs
     */
    @RequestMapping("/user3")
    @ResponseBody
    public void user3(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    /**
     * 集合数据类型
     * 获取集合参数时，要讲集合参数包装到一个POJO中才可以
     * @param vo
     */
    @RequestMapping("/user4")
    @ResponseBody
    public void user4(VO vo) {
        System.out.println(vo);
    }

}
