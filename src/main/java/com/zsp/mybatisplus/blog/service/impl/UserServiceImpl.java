package com.zsp.mybatisplus.blog.service.impl;

import com.zsp.mybatisplus.blog.entity.User;
import com.zsp.mybatisplus.blog.mapper.UserMapper;
import com.zsp.mybatisplus.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZSP
 * @since 2020-07-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
