package com.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3.pojo.TbItem;
import com.e3.service.inter.TbItemService;

@Controller
public class TbItemController {
	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("/tbitem")
	@ResponseBody
	public TbItem getItemById(Long itemId) {
		TbItem tbItem=tbItemService.getItemById(itemId);
		return tbItem;
		
	}
}
