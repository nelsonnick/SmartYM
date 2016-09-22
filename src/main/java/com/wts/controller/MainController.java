package com.wts.controller;


import com.foxinmy.weixin4j.exception.WeixinException;
import com.foxinmy.weixin4j.qy.WeixinProxy;
import com.jfinal.core.Controller;

public class MainController extends Controller {

	/**
	 * 主界面
	 * */
    public void index() throws WeixinException {
        WeixinProxy wp =new WeixinProxy();
        wp.getTokenManager();
        renderText(wp.getUserIdByCode(getPara("code"))[0].toString());
    }

}


