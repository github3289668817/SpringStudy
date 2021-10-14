package per.xgt.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import per.xgt.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/9/13 14:35
 */
@Controller
@RequestMapping("/user")
public class User4Controller {

    /**
     * 网页->(请求)前端控制器DispacherServlet
     * ->(请求查询Handler)处理映射器HandlerMapping
     * ->(返回处理器执行链HandlerExecutionChain)前端控制器DispacherServlet
     * ->(请求执行Handler)处理器适配器HandlerAdaptor
     * ->(请求)处理器Handler
     * ->(响应)处理器适配器HandlerAdaptor
     * ->(返回ModelAndView)前端控制器DispacherServlet
     * ->(请求视图解析器)视图解析器ViewResolver
     * ->(返回视图View对象)前端控制器DispacherServlet
     * ->(渲染视图)视图页面jsp
     */

    /**
     * 1.用户发送请求至前端控制器DispacherServlet
     * 2.DispacherServlet收到请求调用HandlerMapping处理器映射器
     * 3.处理器映射器找到具体的处理器(可以根据XML配置、注解进行查找)，生成处理器对象及处理器拦截器(如果有则生成)一并返回给DispacherServlet
     * 4.DispacherServlet调用HandlerAdaptor处理器适配器
     * 5.HandlerAdaptor经过适配调用具体的处理器(Controller-后端控制器)
     * 6.Controller执行完返回ModelAnView
     * 7.HandlerAdaptor将Controller执行结果ModelAndVew返回给DispacherServlet
     * 8.DispacherServlet将ModelAndView传给ViewResolver视图解析器
     * 9.ViewResolver解析后返回具体View
     * 10.DispacherServlet根据View进行渲染视图(将模型数据填充至视图中)，DispacherServlet响应用户
     */

    //作用：用户建立请求URL和处理请求方法之间的对应关系
    //位置：类上，请求URL的第一季访问目录，如果不写就相当于应用的根目录
    //位置：方法上，请求URL的第二级访问目录，与类上的使用@RequestMapping标注的一级目录一起组成访问虚拟路径
    @RequestMapping("/quick")
    /**
     * value：用于指定请求的URL，它和path属性的作用是一样的
     * method：用于指定请求的方式
     * params：用于指定限制请求参数的条件。它支持简单的表达式，要求请求参数的key和value必须和配置的一模一样
     */
    public String save() {
        System.out.println("Controller Save Running...");
        //加上/表示从根目录找资源，如果不加就会从当前资源目录下找资源
        return "success";
    }

    /**
     * Model：模型，封装数据
     * View：视图，展示数据
     *
     * @return
     */
    @RequestMapping("/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "xgt1");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        //ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "xgt2");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model) {
        //设置模型数据
        model.addAttribute("username", "xgt3");
        return "success";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("username", "xgt4");
        return "success";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("xgt5");
    }

    @RequestMapping("/quick7")
    /**
     * 告知SpringMVC 返回的数据不进行页面跳转，而是数据
     */
    @ResponseBody
    public String save7() {
        return "xgt6";
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() throws JsonProcessingException {
        User user = new User();
        user.setUsername("xgt7");
        user.setAge(25);
        //使用json转换工具将对象转换成json格式的字符串(jackson)
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick9")
    @ResponseBody
    //springmvc自动将User转换成json格式的字符串
    public User save9() {
        User user = new User();
        user.setUsername("xgt8");
        user.setAge(25);
        return user;
    }

    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标资源执行。。。。。。");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName","xgt");
        modelAndView.setViewName("true");
        return modelAndView;
    }

}
