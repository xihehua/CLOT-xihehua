package com.clot.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据封装
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public R() {
		put("code", 1);
		put("msg", "success");
		put("count","0");
	}

	//错误时
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

//	分页
	public static R error(int code, String msg,int count,Object data) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		r.put("count",count);
		r.put("data", data);
		return r;
	}

	//成功时
	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}

	public static R ok(Object data) {
		return new R().put("data",data);
	}


	public static R ok(Object data,int count,String msg,int code) {
		R r=new R();
		r.put("code", code);	//响应编码
		r.put("msg", msg);		//响应消息
		r.put("count",count);	//总数
		r.put("data", data);	//数据
		return r;
	}

	@Override
	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
