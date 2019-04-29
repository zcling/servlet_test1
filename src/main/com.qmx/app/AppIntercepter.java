package app;

import org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by zcl on 2019-04-26.
 */
public class AppIntercepter extends HandlerInterceptorAdapter {


    /**
     * "令牌"属性名称
     */
    private static final String TOKEN_ATTRIBUTE_NAME = "token";
    /**
     * "令牌"Cookie名称
     */
    private static final String TOKEN_COOKIE_NAME = "token";
    /**
     * "令牌"参数名称
     */
    private static final String TOKEN_PARAMETER_NAME = "token";
    /**
     * 错误消息
     */
    private static final String ERROR_MESSAGE = "Bad or missing token!";

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        if (!(o instanceof HandlerMethod)) {
            return super.preHandle(httpServletRequest, httpServletResponse, o);
        }
        HandlerMethod handlerMethod = (HandlerMethod) o;
        Method method = handlerMethod.getMethod();
        return false;
    }

    private boolean normalTokenVerify(HttpServletRequest request, HttpServletResponse response)throws Exception {

    }
}
