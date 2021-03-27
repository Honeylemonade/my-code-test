package com.example.springfundmental.SpringAOP的动态代理;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * BuildService:
 *
 * @Author XvYanpeng
 * @Date 2020/7/14 21:24
 */
@Slf4j
@Component
public class BuildService {
    public void buildOneTag() {
        log.info("buildOneTag");
    }

    public void buildOneGroup() {
        log.info("buildOneGroup");
    }
}
