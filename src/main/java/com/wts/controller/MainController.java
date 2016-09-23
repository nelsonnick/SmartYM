package com.wts.controller;


import com.foxinmy.weixin4j.exception.WeixinException;
import com.foxinmy.weixin4j.qy.WeixinProxy;
import com.jfinal.core.Controller;

public class MainController extends Controller {

	/**
	 * 主界面
	 * */
    public void index() throws WeixinException {
        String userId;
        if (getCookieObject("UserId") == null){
            WeixinProxy wp =new WeixinProxy();
            wp.getTokenManager();
            userId = wp.getUserIdByCode(getPara("code"))[0].toString();
            setCookie("UserId", userId, 9*60);
            System.out.println("无Cookie");
        }else{
            userId=getCookieObject("UserId").getValue();
            System.out.println("有Cookie");
        }
        renderText(userId);
    }

}


