package com.springboot.dao;

import com.springboot.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersDao {

    UsersEntity getById(Integer id);
}
