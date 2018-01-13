package com.lxit.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.Investment;
import com.lxit.p2p.bean.ManageStatisticsLength;
import com.lxit.p2p.dao.InvestmentDao;
import com.lxit.p2p.service.InvestmentService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class InvestmentServiceImpl implements InvestmentService{

	@Resource
	InvestmentDao investmentDao;
	
	@Override
	public int queryCountInvestment(Map<String, Object> map) {
		return investmentDao.queryCountInvestment(map);
	}

	@Override
	public List<Investment> queryInvestmentList(Map<String, Object> map) {
		return investmentDao.queryInvestmentList(map);
	}

	@Override
	public int updateInvestment(Investment investment) {
		return investmentDao.updateInvestment(investment);
	}

	@Override
	public int queryCountInvestmentIndex(Map<String, Object> map) {
		return investmentDao.queryCountInvestmentIndex(map);
	}

	@Override
	public List<Investment> queryInvestmentListIndex(Map<String, Object> map) {
		return investmentDao.queryInvestmentListIndex(map);
	}

	@Override
	public int queryCountInvestmentIndexMark(Map<String, Object> map) {
		return investmentDao.queryCountInvestmentIndexMark(map);
	}

	@Override
	public List<Investment> queryInvestmentListIndexMark(Map<String, Object> map) {
		return investmentDao.queryInvestmentListIndexMark(map);
	}

	@Override
	public List<ManageStatisticsLength> queryManageStatisticsLength(int userId) {
		return investmentDao.queryManageStatisticsLength(userId);
	}
  
}
