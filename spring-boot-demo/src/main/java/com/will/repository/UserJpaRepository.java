package com.will.repository;/**
 * @Auther: lwt
 * @Date: 2018/10/12 16:20
 * @Description: TODO
 */

import com.will.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author lwt
 * @date 2018/10/12
 */
public interface  UserJpaRepository extends JpaRepository<User,Long> {

}
