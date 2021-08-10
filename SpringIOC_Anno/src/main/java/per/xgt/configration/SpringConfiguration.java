package per.xgt.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/10 15:25
 */
//标识该类是Spring的核心配置类
@Configuration
//包扫描配置
@ComponentScan("per.xgt")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {



}
