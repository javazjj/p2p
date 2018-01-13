package com.lxit.p2p.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Investment;
import com.lxit.p2p.bean.ManageStatisticsLength;

public interface InvestmentService {
	/**
	 * 计算总页数
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestment(Map<String, Object> map);

	/**
	 * 分页查询
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentList(Map<String, Object> map);

	/**
	 * 修改
	 * 
	 * @param investment
	 * @return
	 */
	public int updateInvestment(Investment investment);

	/**
	 * 计算总页数 回收债权
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestmentIndex(Map<String, Object> map);

	/**
	 * 分页查询 回收债权
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentListIndex(Map<String, Object> map);

	/**
	 * 计算总页数 产品
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestmentIndexMark(Map<String, Object> map);

	/**
	 * 分页查询 产品
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentListIndexMark(Map<String, Object> map);

	public List<ManageStatisticsLength> queryManageStatisticsLength(int userId);

}
