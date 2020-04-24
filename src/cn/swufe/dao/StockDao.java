package cn.swufe.dao;

import cn.swufe.domain.Stock;

import java.util.List;

public interface StockDao {
    /**
     * 获取关注股票列表
     * @return
     * @throws Exception
     */
    public List<Stock> findAllStockCare() throws Exception;

    /**
     * 添加股票
     * @param stock
     * @return
     * @throws Exception
     */
    public boolean addStock(Stock stock)throws Exception;

    /**
     * 更新股票信息，是否继续关注
     * @param care 是否继续关注
     * @param identifier
     * @return
     * @throws Exception
     */
    public boolean updateStock(int care, String identifier) throws Exception;

}
