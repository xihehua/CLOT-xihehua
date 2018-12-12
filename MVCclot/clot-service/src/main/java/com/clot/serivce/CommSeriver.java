package com.clot.serivce;

import com.clot.entity.Commodity;
import com.clot.entity.Commoditylist;
import com.clot.entity.Commoditysignup;

import java.util.List;

public interface CommSeriver {

    //    查询全部
   //List<Commodity> selectComAll();

   //查询全部商品
    List<Commoditylist> selectCylist(int page,int limit);

    //查询总数
    int selectCylistCount();

    //注册
    int addUser(Commoditysignup commoditysignup);

    //登录
    int loginUser(String emailaddress,String pamssword);

    //删除
    int deleteCommdity(int cynumber);

 /**
  * 添加
  **/
 int insertCommoditylist(Commoditylist commoditylist);
}
