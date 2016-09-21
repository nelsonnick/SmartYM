package com.wts.controller;


import com.foxinmy.weixin4j.qy.WeixinProxy;
import com.jfinal.core.Controller;

public class MainController extends Controller {

	/**
	 * 主界面
	 * */
    public void index() {
        WeixinProxy wp =new WeixinProxy();
        render("dist/index.html");
    }

}


