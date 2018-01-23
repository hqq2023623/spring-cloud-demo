package zj.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaServerApplication {
    //启动类不能叫做EurekaServerBootstrap，因为已经有一个了 - -
    public static void main(String[] args) {
        //下面两行代码都可以用来启动
//        SpringApplication.run(EurekaServerBootstrap.class, args);
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }

}