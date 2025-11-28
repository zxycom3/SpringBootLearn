//package springboo.example.taliapro.Filter;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class GlobalCorsConfig {
//
//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration config = new CorsConfiguration();
//        // 必须和前端URL的「域名+端口」完全一致，这里是http://localhost:63342
//        config.addAllowedOrigin("http://localhost:63342");
//        config.setAllowCredentials(true);
//        config.addAllowedMethod("*");
//        config.addAllowedHeader("*");
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsFilter(source);
//    }
//}