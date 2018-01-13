package com.lxit.p2p.dao;

import java.util.List;

import com.lxit.p2p.bean.Applyloans;
/**
 * 贷款
 * @author Administrator
 *
 */
public interface ApplyloansDao {
    /**
     * 查询
     * @param applyLoansId
     * @return
     */
	public List<Applyloans> queryApplyloans(int applyLoansId);
}
