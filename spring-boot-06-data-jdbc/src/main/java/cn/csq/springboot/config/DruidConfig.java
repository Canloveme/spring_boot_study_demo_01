package cn.csq.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * //@Configuration 指定为一个配置类
 * @author csq
 * @date 2020/11/4 14:30:01
 */
@Configuration
public class DruidConfig {

    /**
     * 使用@Bean注解将dataSource注入到容器中
     * 使用ConfigurationProperties(prefix = "spring.datasource")
     * 将配置文件中前缀为spring.datasource与DruidDataSource对象相绑定
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

   /* //配置Druid的监控
    //1. 配置一个管理后台的Servlet
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //配置初始化参数
        Map<String, String> initParams = new HashMap<>();
        //配置登录用户
        initParams.put("loginUsername", "admin");
        //配置登录用户密码
        initParams.put("loginPassword", "admin");
        //默认允许所有访问,这里设置只有admin能访问
        initParams.put("allow", "admin");
        //配置拒绝
        //initParams.put("deny", "192.xxx.xxx.xxx");
        bean.setInitParameters(initParams);
        return bean;
    }

    //2.配置一个监控的filter
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        //配置不拦截的资源
        initParams.put("exclusions", "*.js,*.css,*.images,/druid/*");
        bean.setInitParameters(initParams);
        //拦截所有请求
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }*/
}
