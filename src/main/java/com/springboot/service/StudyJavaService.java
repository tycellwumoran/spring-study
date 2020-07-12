package com.springboot.service;

import com.springboot.dao.UsersDao;
import com.springboot.entity.UsersEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudyJavaService {


    private static Logger logger = LoggerFactory.getLogger(StudyJavaService.class);


    @Resource
    private UsersDao usersDao;

    public Integer getUser(Integer id) {

        UsersEntity usersEntity = usersDao.getById(id);
        logger.debug("debug level ={}",usersEntity);
        logger.info("info level usersEntity ={}",usersEntity);
        logger.error("error level usersEntity ={}",usersEntity);
        return id;
    }

}
