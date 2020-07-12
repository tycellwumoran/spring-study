package com.springboot.service;

import com.springboot.dao.UsersDao;
import com.springboot.entity.UsersEntity;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudyJavaService {


    private static Logger logger = Logger.getLogger(StudyJavaService.class);


    @Resource
    private UsersDao usersDao;

    public Integer getUser(Integer id) {

        UsersEntity usersEntity = usersDao.getById(id);
        logger.debug(usersEntity);
        logger.info(usersEntity);
        return id;
    }

}
