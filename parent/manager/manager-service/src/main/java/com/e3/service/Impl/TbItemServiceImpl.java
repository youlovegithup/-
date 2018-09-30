package com.e3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3.mapper.TbItemMapper;
import com.e3.pojo.TbItem;
import com.e3.service.inter.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService{
@Autowired
private TbItemMapper tbitemMapper;
	@Override
	public TbItem getItemById(long itemId) {
		TbItem tbItem=tbitemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
