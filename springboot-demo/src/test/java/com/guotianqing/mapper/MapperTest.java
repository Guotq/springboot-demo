package com.guotianqing.mapper;


import com.guotianqing.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void getUser(){
        List user =mapper.select(new User());
        log.debug("user name-----"+user.get(0));
    }

}
