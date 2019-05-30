package com.xrq.springbootmybatisdemo;

import com.xrq.springbootmybatisdemo.dao.StudentDao;
import com.xrq.springbootmybatisdemo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {

    @Autowired
    StudentDao dao;



    @Test
    public void contextLoads() {
        Student s = dao.Sel("");
        System.out.println(s.getName());
    }

}
