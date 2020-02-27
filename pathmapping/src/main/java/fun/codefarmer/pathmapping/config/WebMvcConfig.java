package fun.codefarmer.pathmapping.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 可节省controller中代码
 * @ @ClassName WebMvcConfig
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/27 15:29
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/codefarmer").setViewName("hello");
        //如果有多个可以继续添加
    }
}
