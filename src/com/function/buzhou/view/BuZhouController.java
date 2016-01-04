package com.function.buzhou.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.util.JsonUtil;
import com.function.buzhou.service.impl.BuzhouServiceImpl;
import com.yy.util.ExtHelper;

@Controller
public class BuZhouController {
	
	@Autowired
	BuzhouServiceImpl buzhou;
	
	@RequestMapping(value = "/buzhou/list/{functionId}",method=RequestMethod.POST)
	public void test1(@PathVariable("functionId") String functionId,HttpServletRequest request,
			HttpServletResponse response){
	 
			Map<String,String> map= new HashMap();
			map.put("functionId", functionId);
			
			String str=buzhou.getList(map);
			JsonUtil.printJsonListString(request,response,str);
		 
	 
   }
	
	public void finalize() throws Throwable{
		super.finalize(); 
	}
	 
}
