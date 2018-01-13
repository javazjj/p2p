package com.lxit.p2p.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Investment;
import com.lxit.p2p.bean.ManageStatisticsLength;

public interface InvestmentService {
	/**
	 * ������ҳ��
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestment(Map<String, Object> map);

	/**
	 * ��ҳ��ѯ
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentList(Map<String, Object> map);

	/**
	 * �޸�
	 * 
	 * @param investment
	 * @return
	 */
	public int updateInvestment(Investment investment);

	/**
	 * ������ҳ�� ����ծȨ
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestmentIndex(Map<String, Object> map);

	/**
	 * ��ҳ��ѯ ����ծȨ
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentListIndex(Map<String, Object> map);

	/**
	 * ������ҳ�� ��Ʒ
	 * 
	 * @param map
	 * @return
	 */
	public int queryCountInvestmentIndexMark(Map<String, Object> map);

	/**
	 * ��ҳ��ѯ ��Ʒ
	 * 
	 * @return
	 */
	public List<Investment> queryInvestmentListIndexMark(Map<String, Object> map);

	public List<ManageStatisticsLength> queryManageStatisticsLength(int userId);

}
