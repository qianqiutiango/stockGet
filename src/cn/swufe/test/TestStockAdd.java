package cn.swufe.test;

import cn.swufe.Util.dbconnection;
import cn.swufe.dao.impl.StockDaoImpl;
import cn.swufe.dao.StockDao;
import cn.swufe.domain.Stock;

public class TestStockAdd {

    public static void main(String[] args) throws Exception {
        dbconnection db=new dbconnection();
        StockDao stockDao = new StockDaoImpl(db.getConnection());
        Stock stock = new Stock();
        stock.setIdentifier("sh601006");
        stock.setName("大秦铁路");
        stock.setCare(1);
        stockDao.addStock(stock);
        db.closeConnection(db.getConnection());
    }


}
