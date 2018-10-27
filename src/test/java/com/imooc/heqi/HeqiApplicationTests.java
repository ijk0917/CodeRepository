package com.imooc.heqi;

import com.imooc.heqi.dao.CategoryRepository;
import com.imooc.heqi.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.acl.LastOwnerException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HeqiApplication.class)
@Slf4j
public class HeqiApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void contextLoads() {
//        Map<String,Float> map = new HashMap<>();
//        map.put("3", (float) 1.45);
//        System.out.println(map.get("3")+"");

//        Category category = categoryRepository.updateById("000000",1);
//        Category category = categoryRepository.selectById(1);
//        log.info("category: " + category);
        String string = new String(" ");
        if(StringUtils.isEmpty(string)){
            log.info("为空");
        }else {
            log.info("不为空");
        }


        log.info("-------------");
    }

}
