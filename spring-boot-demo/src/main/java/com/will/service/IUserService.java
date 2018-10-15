package com.will.service;/**
 * @Auther: lwt
 * @Date: 2018/10/12 16:35
 * @Description: TODO
 */

import com.will.entity.User;

import java.util.List;

/**
 * @ClassName IUserService
 * @Description TODO
 * @Author lwt
 * @date 2018/10/12
 */
public interface IUserService {
    public List<User> findAll();

    public void saveUser(User book);

    public User findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);

}
