package com.web.demos;

import com.web.demos.model.User;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class DemosApplicationTests {
    @Autowired
    StringEncryptor encryptor;
    @Value("${my.school}")
    String mySchool;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getPass() {
        System.out.println("==============mySchhol☆☆☆☆☆☆" + mySchool);
        String url = encryptor.encrypt("jdbc:mysql://47.97.192.116:3306/sell?characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2b8");
        String name = encryptor.encrypt("你的数据库名");
        String password = encryptor.encrypt("你的数据库密码");
        final String decrypt = encryptor.decrypt("IXe781oFn7VtPE4QUJZOnY42FlZi3Eb4JGqG5jJrzy8=");
        System.out.println("decrypt:" + decrypt);
        System.out.println(url + "----------------");
        System.out.println(name + "----------------");
        System.out.println(password + "----------------");
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
        System.out.println(">>>>>>>");
        if (!log.isDebugEnabled()) {
            System.out.println("!!!!!!!");
            log.warn("NBA第一人是{},第二人是{}", "詹姆斯", "库里");
            log.warn("echo", new RuntimeException("mamam"));
            System.out.println(log.getName());
        }
    }

    @Test
    public void testSensitive() {
//        final User sdfdsfdsf = User.builder().email("hruipeng@jd.com").idCard("410526198902083479").password("sdfdsfdsf").phone("17600904764").username("7sl37").build();
        final User user1 = new User();
        user1.setEmail("hruipeng@jd.com");
        user1.setIdCard("410526198902083479");
        user1.setPassword("43243223");
        user1.setPhone("17600904764");
        user1.setUsername("x723lsd");
        System.out.println(user1);
        System.out.println();
        log.warn("用户信息为：{}" + user1);

    }
}