package com.clot.dao;

import com.clot.entity.Commoditylist;
import com.clot.entity.Commoditysignup;
import com.clot.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;

import javax.xml.bind.SchemaOutputResolver;

import static org.junit.Assert.*;


@ContextConfiguration({"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//@TransactionConfiguration(defaultRollback = true)  //被弃用
@Rollback(true)  //是否回滚

@Service
public class CyListDaoTest {

    @Autowired
    private CyListDao dao;

    @Test
    public void findAllCommodity() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CyListDao  dao=applicationContext.getBean(CyListDao.class);
        System.out.println(dao.selectCylist(1,2));
    }

    @Test
    public void addUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CyListDao  dao=applicationContext.getBean(CyListDao.class);
        Commoditysignup user =new Commoditysignup();
        user.setFirstname("dmin");
        user.setLastname("A");
        user.setEmailaddress("13686677942@qq.com");
        user.setPamssword("1111");
        System.out.println(dao.addUser(user));
    }

    @Test
    public void loginUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CyListDao  dao=applicationContext.getBean(CyListDao.class);
        System.out.println(dao.loginUser("1", MD5Util.md5("1")));
    }

    @Test
    public void deleteCommdity(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CyListDao  dao=applicationContext.getBean(CyListDao.class);

        System.out.println(dao.deleteCommdity(1));
    }

    @Test
    public void insertCommoditylist() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CyListDao  dao=applicationContext.getBean(CyListDao.class);
        Commoditylist commoditylist=new Commoditylist();
        commoditylist.setCybrandid(1);
        commoditylist.setCycolorid(2);
        commoditylist.setCytypeid(3);
        commoditylist.setCyname("4");
        commoditylist.setCyprice(23);
        commoditylist.setCyphotoa("4");
        commoditylist.setCyphotob("6");
        commoditylist.setCydetails("11");
        System.out.println(dao.insertCommoditylist(commoditylist));
    }
}