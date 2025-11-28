package springboo.example.taliapro.Filter;

import ch.qos.logback.core.util.StringUtil;
import com.alibaba.fastjson2.JSONObject;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.utils.Jwttool;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@Slf4j
@WebFilter(urlPatterns = "/*")
public class empfi implements Filter { // 实现Filter接口

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse reps=(HttpServletResponse) response;
        String url=req.getRequestURI();
//        if("OPTIONS".equalsIgnoreCase(req.getMethod())){
//            reps.setStatus(HttpServletResponse.SC_OK);
//            return;
//        }
        if( url.contains("login") || url.contains("data") ||
                url.endsWith(".html") ||
                url.endsWith(".js") ||
                url.endsWith(".css") ||
                url.endsWith(".png") ||
                url.endsWith(".jpg") ||
                url.endsWith(".jpeg") ||
                url.endsWith(".ico"))
        {
           log.info("登陆界面，放行");
           chain.doFilter(request,response);
           return ;
        }
        String jwt=req.getHeader("token");
        if(!StringUtils.hasLength(jwt))
        {
            Result error=Result.error("NOT+LOGIN");
            String notlogin= JSONObject.toJSONString(error);
            reps.getWriter().write(notlogin);
            log.info(error +"1");
            return;
        }
        else {
            try {
          Claims  claims = Jwttool.Decode(jwt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                Result error=Result.error("NOT+LOGIN");
                String notlogin= JSONObject.toJSONString(error);
                reps.getWriter().write(notlogin);
                log.info(error +"2");
                return;
            }
            chain.doFilter(request, response);
            log.info("放行到最后");
            return ;
        }
    }
}