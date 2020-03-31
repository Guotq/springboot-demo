package com.guotianqing;

import com.guotianqing.mapper.UserMapper;
import com.guotianqing.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private UserMapper mapper;

    @GetMapping("hello/{id}")
    public User hello(@PathVariable("id") int id) {
        User user = mapper.selectByPrimaryKey(id);
        log.debug("可以直接调用log打印日志了");
        return user;
    }


}
