package com.zbw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zbw
 * @date - 15:04
 */
@SpringBootApplication
@MapperScan("com.zbw.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
class Name{
    private static  String s;
    static {
        s=new String();
    }
    public static String getS(){
        return s;
    }
}
