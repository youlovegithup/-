package com.taotao.service;

import com.taotao.pojo.TbItem;

public interface ItemService {
	//商品的ID来查询商品的详细信息
	TbItem getTbItemById(long id);
}
