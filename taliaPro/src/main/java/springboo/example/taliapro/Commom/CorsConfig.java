package springboo.example.taliapro.Commom;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
@author zhang
@Date   2025/11/17 16:31
@description
*/
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 改为全局匹配所有接口（或按需调整路径）
        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:63342") // 替换allowedOrigins
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true)
                .maxAge(3600)
                .exposedHeaders("token");
    }
}
