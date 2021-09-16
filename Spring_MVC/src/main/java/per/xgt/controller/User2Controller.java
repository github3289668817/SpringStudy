package per.xgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import per.xgt.domain.User;
import per.xgt.domain.VO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
        System.out.println("哈哈哈哈");
    }

    /**
     * 获得集合数据类型参数
     * 当使用ajax提交时，可以指定ContentType为json形式，那么在方法参数位置使用@RequestBody可以直接接受集合数据而无需使用POJO进行包装
     * @param userList
     */
    @RequestMapping("/user5")
    @ResponseBody
    public void user5(@RequestBody List<User> userList) {
        System.out.println(userList);
        System.out.println("哈哈哈哈");
    }

    /**
     * 参数绑定：当请求的参数名称与Controller的业务方法参数名称不一致时，就需要通过@RequestParam注解显示的绑定
     * @RequestParam 还有如下参数：
     * 1.value：请求参数名称
     * 2.required：此在指定的请求参数是否必须包括，默认是true，提交时如果没有此参数则报错
     * 3.defaultValue：当没有指定请求参数时候，则使用指定的默认值赋值
     * @param username
     */
    @RequestMapping("/user6")
    @ResponseBody
    public void user6(@RequestParam(value = "name") String username) {
        System.out.println(username);
    }

    /**
     * RestFul风格的请求时使用url+请求方式表示一次请求目的的
     * 1.get：获取资源
     * 2.post：新建资源
     * 3.put：更新资源
     * 4.delete：删除资源
     * 获得Resful风格的参数
     * 在SpringMVC中可以使用占位符进行参数绑定。地址/user/1可以写成/user/{id}，占位符{id}对应的就是1的值，在业务方法中我们可以使用@PathVariable注解进行占位符的匹配获取工作
     */
    @RequestMapping("/user7/{username}")
    @ResponseBody
    public void user7(@PathVariable(value = "username",required = false) String name){
        System.out.println(name);
    }

    /**
     * 自定义类型转换器
     * SpringMVC默认已经提供了一些常用的类型转换器，但是不是所有的数据类型都提供了转换器，没有提供的就需要自定义转换器，例如时间类型
     * 1.自定义转换类实现Converter接口
     * 2.在配置文件中意声明转换器
     * 3.在<annotation-driven>中引用转换器
     */
    @RequestMapping("/user8")
    @ResponseBody
    public void user8(Date date){
        System.out.println(date);
    }

    /**
     * 获取请求头信息
     * @RequestHeader
     *      1.value：请求头名称
     *      2.required：是否必须携带此请求头
     * 获取指定Cookie的值
     * @CookieValue
     *      1.value：指定cookid的名称
     *      2.required：是否必须携带此cookie
     * @param userAgent
     */
    @RequestMapping("/user9")
    @ResponseBody
    public void user9(@RequestHeader(value = "User-Agent",required = false) String userAgent,@CookieValue(value = "JSESSIONID",required = false)String jsessionId){
        System.out.println(userAgent);
        System.out.println(jsessionId);
    }

    /**
     * 文件上传：
     * 客户端三要素：
     * 1.表单项type = file
     * 2.表单请求方式是post
     * 3.表单的enctype属性是多部分表单形式，及enctype=multipart/form-data
     *
     * 当form表单修改为多部分表单时，request.getParameter将失效
     * enctype="application/x-www-form-uriencoded"时，form表单的正文内容格式是键值对
     * enctype="Mutilpart/form-data"时请求正文内容就编程多部分形式
     *
     * 单文件上传：
     * 1.导入fileupload和io的坐标
     * 2.配置文件上传解析器
     * 3.编写代码
     * @param upload 文件的名字要和input name属性一直
     */
    @RequestMapping("/user10")
    @ResponseBody
    public void user10(String username,MultipartFile upload){
        System.out.println(username);
        //获得上传文件的名称
        String fileName = upload.getOriginalFilename();
        try {
            //存储文件
            upload.transferTo(new File("D:\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(upload);
    }

    @RequestMapping("/user11")
    @ResponseBody
    public void user11(String username,MultipartFile upload1,MultipartFile upload2){
        System.out.println(username);
        //获得上传文件的名称
        String fileName1 = upload1.getOriginalFilename();
        try {
            //存储文件
            upload1.transferTo(new File("D:\\"+fileName1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName2 = upload2.getOriginalFilename();
        try {
            //存储文件
            upload2.transferTo(new File("D:\\"+fileName2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/user12")
    @ResponseBody
    public void user12(String username,MultipartFile[] uploads){
        System.out.println(username);
        //获得上传文件的名称
        for (int i = 0; i < uploads.length; i++) {
            String fileName1 = uploads[i].getOriginalFilename();
            try {
                //存储文件
                uploads[i].transferTo(new File("D:\\"+fileName1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
