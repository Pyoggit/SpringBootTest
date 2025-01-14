package com.zeus.service;

import java.util.List;

import com.zeus.domain.Item;

public interface ItemService {
	List<Item> list() throws Exception;

	List<Item> search(String keyword) throws Exception;

	void regist(Item item) throws Exception;

	Item read(Integer itemId) throws Exception;

	void modify(Item item) throws Exception;

	void remove(Integer itemId) throws Exception;

	String getPicture(Integer itemId) throws Exception;
}
