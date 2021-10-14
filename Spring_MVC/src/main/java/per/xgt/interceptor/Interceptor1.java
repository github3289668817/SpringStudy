package per.xgt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/14 10:37
 */
public class Interceptor1 implements HandlerInterceptor {
    /**
     * 在目标方法执行之前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");
        String param = request.getParameter("parm");
        if ("yes".equals(param)){
            return true;
        }else {
            request.getRequestDispatcher("/jsp/error.jsp").forward(request,response);
            return false;
        }
    }

    /**
     * 目标方法执行之后，视图返回之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("userName","hahaha...");
        System.out.println("postHandle...");
    }

    /**
     * 整个流程都执行完毕后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
