package com.zsp.mybatisplus.blog.controller;


import com.zsp.mybatisplus.blog.exception.Try;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZSP
 * @since 2020-07-19
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zsp");

        System.out.println(list.get(1));
    }



}

