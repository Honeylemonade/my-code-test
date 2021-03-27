package com.example.springfundmental.transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * DemoService:
 *
 * @Author XvYanpeng
 * @Date 2020/7/18 11:04
 */
@Service
public class DemoService {
    @Transactional
    public void laoda() {
        System.out.println("1");
        xiaodi();
    }

    @Transactional
    public void xiaodi() {
        System.out.println("2");

    }

    public static void main(String[] args) {

    }
}
