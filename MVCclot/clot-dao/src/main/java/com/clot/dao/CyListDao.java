package com.clot.dao;

import com.clot.entity.Commodity;
import com.clot.entity.Commoditylist;
import com.clot.entity.Commoditysignup;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyListDao {

    //    查询全部
    //List<Commodity> selectComAll();

    //查询全部商品
    List<Commoditylist> selectCylist(@Param("page") int page,@Param("limit") int limit);
    //查询总数
    int selectCylistCount();

    //注册用户
    int addUser(Commoditysignup commoditysignup);

    //登录
    int loginUser(@Param("emailaddress")String emailaddress,@Param("pamssword")String pamssword);

    //删除
    int deleteCommdity(int cynumber);

    /**
     * 添加
     **/
    int insertCommoditylist(Commoditylist commoditylist);
}
