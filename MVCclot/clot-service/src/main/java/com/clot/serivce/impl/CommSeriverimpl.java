package com.clot.serivce.impl;

import com.clot.dao.CommDao;
import com.clot.dao.CyListDao;
import com.clot.entity.Commodity;
import com.clot.entity.Commoditylist;
import com.clot.entity.Commoditysignup;
import com.clot.serivce.CommSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommSeriverimpl implements CommSeriver {

    @Autowired
    CyListDao cyListDao;
//    查询全部
//    public List<Commodity> selectComAll() {
//        return  commDao.selectComAll();
//    }

    //  查询全部商品
    public List<Commoditylist> selectCylist(int page,int limit) {
        return cyListDao.selectCylist(page,limit);
    }

    //  查询总数
    public int selectCylistCount() {
        return cyListDao.selectCylistCount();
    }

    //   注册用户
    public int addUser(Commoditysignup commoditysignup) {
        return cyListDao.addUser(commoditysignup);
    }

    //  用户登录
    public int loginUser(String emailaddress, String pamssword) {
        return cyListDao.loginUser(emailaddress,pamssword);
    }

    //删除商品
    public int deleteCommdity(int cynumber) {
        return cyListDao.deleteCommdity(cynumber);
    }

    //添加
    public int insertCommoditylist(Commoditylist commoditylist) {
        return cyListDao.insertCommoditylist(commoditylist);
    }


}


























