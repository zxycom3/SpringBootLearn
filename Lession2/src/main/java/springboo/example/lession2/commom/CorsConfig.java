package springboo.example.lession2.commom;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
@author zhang
@Date   2025/9/29 10:28
@description
*/
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 对所有/api/**路径生效
                .allowedOrigins("http://localhost:3030") // 允许前端域名
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的请求方法
                .allowCredentials(true) // 允许携带Cookie
                .maxAge(3600); // 预检请求有效期（秒）
    }
}