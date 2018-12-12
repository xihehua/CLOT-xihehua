package com.clot.webui.controller;

import com.clot.entity.Commoditysignup;
import com.clot.serivce.CommSeriver;
import com.clot.utils.MD5Util;
import com.clot.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
@RequestMapping("/test")
public class Controller {

    @Autowired
    CommSeriver commSeriver;


//    查询全部
//    @RequestMapping("/selectComAll")
//    @ResponseBody
//    public R seletComAll(){
//        return R.ok(commSeriver.selectComAll());
//    }

    //    查询全部商品
    @RequestMapping("/rest")
    @ResponseBody
    public R selectCyList(int page, int limit){
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
    public R loginUser(String emailaddress, String pamssword, HttpServletRequest request) {
        String passwordByMd5 = MD5Util.md5(pamssword);

        int count=commSeriver.loginUser(emailaddress,passwordByMd5);
        String msg;
        if (count>0){
            HttpSession session=request.getSession();
            session.setAttribute("emailaddress",emailaddress);
            session.setAttribute("login","123");
            msg="登录成功！";
            R r=new R();
            r.put("msg",msg);
            return R.ok(r);
        }else {
            msg="登录失败！";
            return R.error(msg);
        }

    }


    //删除商品
    @ResponseBody
    @RequestMapping("user/deleteCommdity")
    public R deteGoodsByIds(int cynumber){

        return R.ok(commSeriver.deleteCommdity(cynumber));
    }


}









































