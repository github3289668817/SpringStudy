package per.xgt.resolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import per.xgt.exception.MyException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常处理
 * @author Valen
 * @version V1.0
 * @date 2021/10/19 14:12
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof NullPointerException){
            modelAndView.addObject("error","NoData");
        }else if (e instanceof MyException){
            modelAndView.addObject("error","MyException");
        }else {
            modelAndView.addObject("error","false");
        }
        return modelAndView;
    }
}
