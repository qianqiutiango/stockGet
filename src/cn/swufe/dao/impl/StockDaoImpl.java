package cn.swufe.dao.impl;

import cn.swufe.dao.StockDao;
import cn.swufe.domain.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StockDaoImpl implements StockDao {
    private Connection conn;

    public StockDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Stock> findAllStockCare() throws Exception {
        List<Stock> stockList = new ArrayList<>();
        String sql="select * from stock where care = 1 ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while (rs.next()){
            Stock stock = new Stock();
            stock.setIdentifier(rs.getString(2));
            stock.setName(rs.getString(3));
            stock.setCare(rs.getInt(4));
            stockList.add(stock);
        }
        return stockList;
    }

    @Override
    public boolean addStock(Stock stock) throws Exception {

        String sql="INSERT INTO stock (identifier, name, care) VALUES (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,stock.getIdentifier());
        pstmt.setString(2,stock.getName());
        pstmt.setInt(3,stock.getCare());

        int num = pstmt.executeUpdate();
        if(num>0){
            return true;
        }

        return false;

    }

    @Override
    public boolean updateStock(int care, String identifier) throws Exception {

        String sql="update stock set care=? where identifier = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,care);
        pstmt.setString(2,identifier);
        int num = pstmt.executeUpdate();
        if(num > 0){
            return true;
        }

        return false;
    }
}
