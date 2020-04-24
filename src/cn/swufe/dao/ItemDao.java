package cn.swufe.dao;

import cn.swufe.domain.Item;

import java.util.List;

public interface ItemDao {
    public List<Item> findAllItem() throws Exception;
    public boolean addItem(Item item)throws Exception;
}
