package com.lxit.p2p.service;

import java.util.List;

import com.lxit.p2p.bean.Product;

public interface ProductService {
	/**
	 * ��ѯ
	 * 
	 * @return
	 */
	public List<Product> queryProduct(int productId);
}
