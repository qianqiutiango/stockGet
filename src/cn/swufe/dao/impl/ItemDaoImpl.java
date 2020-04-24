package cn.swufe.dao.impl;

import cn.swufe.dao.ItemDao;
import cn.swufe.domain.Item;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    private Connection conn;

    public ItemDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Item> findAllItem() throws Exception {
        List<Item> itemList = new ArrayList<>();
        String sql="select * from item  ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while (rs.next()){
            Item item = new Item();
            item.setIdentifier(rs.getString(2));
            item.setPrice(rs.getFloat(3));
            item.setDate(rs.getDate(4));
            itemList.add(item);
        }
        return itemList;
    }

    @Override
    public boolean addItem(Item item) throws Exception {
        String sql="INSERT INTO item (identifier, price, date ) VALUES (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,item.getIdentifier());
        pstmt.setFloat(2,item.getPrice());
        pstmt.setDate(3, (Date) item.getDate());

        int num = pstmt.executeUpdate();
        if(num>0){
            return true;
        }
        return false;
    }
}
