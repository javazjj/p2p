package com.lxit.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.Product;
import com.lxit.p2p.dao.ProductDao;
import com.lxit.p2p.service.ProductService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class ProductServiceImpl implements ProductService{

	@Resource
	ProductDao productDao;
	
	@Override
	public List<Product> queryProduct(int productId) {
		return productDao.queryProduct(productId);
	}

}
