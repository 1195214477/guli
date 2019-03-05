package com.guli.sysuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan(basePackages={"com.guli.sysuser","com.guli.common"})
public class SysuserApplication {

    public static void main(String[] args){
        SpringApplication.run(SysuserApplication.class,args);

    }
}
