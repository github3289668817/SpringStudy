package per.xgt.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/9/15 15:51
 */
public class CharsetEncodingFilter implements Filter {

    private static String encoding = "UTF-8"; // 定义变量接收初始化的值

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
