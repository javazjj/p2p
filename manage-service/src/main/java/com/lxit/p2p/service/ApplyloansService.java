package com.lxit.p2p.service;

import java.util.List;

import com.lxit.p2p.bean.Applyloans;

public interface ApplyloansService {
	/**
	 * ��ѯ
	 * 
	 * @param applyLoansId
	 * @return
	 */
	public List<Applyloans> queryApplyloans(int applyLoansId);
}
