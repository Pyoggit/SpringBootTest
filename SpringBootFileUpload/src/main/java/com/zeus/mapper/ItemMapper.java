package com.zeus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.domain.Item;

public interface ItemMapper {
	List<Item> list() throws Exception;

	List<Item> search(@Param("searchKeyword") String searchKeyword) throws Exception; // search 메서드 정의

	void create(Item item) throws Exception;

	Item read(Integer itemId) throws Exception;

	void update(Item item) throws Exception;

	void delete(Integer itemId) throws Exception;

	String getPicture(Integer itemId) throws Exception;
}
