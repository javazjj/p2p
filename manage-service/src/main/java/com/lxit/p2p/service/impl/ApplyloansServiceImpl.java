package com.lxit.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.Applyloans;
import com.lxit.p2p.dao.ApplyloansDao;
import com.lxit.p2p.service.ApplyloansService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class ApplyloansServiceImpl implements ApplyloansService{

	@Resource
	ApplyloansDao applyloansDao;
	
	@Override
	public List<Applyloans> queryApplyloans(int applyLoansId) {
		return applyloansDao.queryApplyloans(applyLoansId);
	}

}
