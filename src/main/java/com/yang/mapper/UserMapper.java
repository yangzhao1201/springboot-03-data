package com.yang.mapper;

import com.yang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TangYuan
 * @create 2021--06--07--14:55
 * @description
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> getUserList();

    User getUser();

    int addUser();

    int update();
}
