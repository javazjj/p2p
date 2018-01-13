package com.lxit.p2p.dao;

import java.util.List;

import com.lxit.p2p.bean.Product;

/**
 * 产品
 * 
 * @author Administrator
 *
 */
public interface ProductDao {
    /**
     * 查询
     * @return
     */
	public List<Product> queryProduct(int productId);

}
