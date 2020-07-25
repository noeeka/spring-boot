package com.xiaomao.xiaomao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@SpringBootApplication
@ServletComponentScan
public class XiaomaoApplication {

    @Mapper
    public static void main(String[] args) {
        SpringApplication.run(XiaomaoApplication.class, args);
    }

}
