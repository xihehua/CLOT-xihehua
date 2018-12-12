package com.clot.webui.controller;

import com.clot.entity.Commoditylist;
import com.clot.entity.Commoditysignup;
import com.clot.serivce.CommSeriver;
import com.clot.utils.MD5Util;
import com.clot.utils.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    CommSeriver commSeriver;


//    查询全部
//    @RequestMapping("/selectComAll")
//    @ResponseBody
//    public R seletComAll(){
//        return R.ok(commSeriver.selectComAll());
//    }

    //    查询全部商品
    @RequestMapping("/selectCyList")
    @ResponseBody
    public R selectCyList(Integer page, Integer limit){
        System.out.println(page+","+limit);
        System.out.println(R.ok(commSeriver.selectCylist(page,limit),commSeriver.selectCylistCount(),"查询成功",0));
        return R.ok(commSeriver.selectCylist(((page-1)*limit),limit),commSeriver.selectCylistCount(),"查询成功",0);
    }


    //注册用户
    @RequestMapping("/addUser")
    @ResponseBody
    public R addUser(String firstname,String lastname,String emailaddress,String pamssword){
        pamssword = MD5Util.md5(pamssword);
        Commoditysignup user = new Commoditysignup();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmailaddress(emailaddress);
        user.setPamssword(pamssword);
        commSeriver.addUser(user);
        return R.ok();
    }


    ///验证登录
    @RequestMapping("/login_check")
    @ResponseBody
    public R loginUser(String emailaddress, String pamssword,HttpServletRequest request) {
        String passwordByMd5 = MD5Util.md5(pamssword);

        int count=commSeriver.loginUser(emailaddress,passwordByMd5);
        String msg;
        if (count>0){
            HttpSession session=request.getSession();
            session.setAttribute("login","123");
            msg="登录成功！";
            R r=new R();
            r.put("msg",msg);
            r.put("emailaddress",emailaddress);
            return R.ok(r);
        }else {
            msg="登录失败！";
            return R.error(msg);
        }


    }


    //删除商品
    @ResponseBody
    @RequestMapping("/delete")

    public R delete(int cynumber){

        return R.ok(commSeriver.deleteCommdity(cynumber));
    }

    //添加商品
    @ResponseBody
    @RequestMapping("/insertCommdityList")

    public R insertCommdityList(int cybrandid,int cytypeid, int cycolorid,String cyname,int cyprice,String cyphotoa,String cydetails,String cyphotob ){
        return R.ok(commSeriver.insertCommoditylist(new Commoditylist(0,cybrandid,cytypeid,cycolorid,cyname,cyprice,cyphotoa,cydetails,cyphotob)));
    }



}









































