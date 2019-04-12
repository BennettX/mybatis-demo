package com.example.mybatisdemo.dao;

import com.example.mybatisdemo.model.UserModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface UserDao {

    @Insert("INSERT INTO `mybatis_demo`.`t_user` ( `user_name`, `password`, `email`, `telephone`, `create_by`, " +
            "`create_time`, `update_by`, `update_time` ) VALUES ( #{userName}, #{password}, #{email}," +
            " #{telephone}, #{createBy}, now(), #{updateBy}, now() )")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int insert(UserModel model);

}
