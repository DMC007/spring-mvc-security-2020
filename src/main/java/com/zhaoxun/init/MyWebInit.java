package com.zhaoxun.init;

import com.zhaoxun.config.AppConfig;
import com.zhaoxun.config.MvcConfig;
import com.zhaoxun.config.Security;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author ZX
 * @Date 2020/5/2 13:57
 * @Version 1.0
 */
public class MyWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class, Security.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
