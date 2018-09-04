package com.mypanda.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping("/model")
	public ModelAndView showModel() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("model");
		modelAndView.addObject("title", "hello template");
		
		// List
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c++");
        list.add("oracle");
        modelAndView.addObject("bookList", list);
        
        // Map
		Map<String, String> map = new HashMap<String,String>();
		map.put("zhangsan", "北京");
        map.put("lisi", "上海");
        map.put("wangwu", "深圳");
        modelAndView.addObject("map",map);
        
		return modelAndView;
	}
}
