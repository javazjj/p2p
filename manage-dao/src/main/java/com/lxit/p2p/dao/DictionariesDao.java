package com.lxit.p2p.dao;

import java.util.List;

import com.lxit.p2p.bean.Dictionaries;

/**
 * 数据字典
 * 
 * @author Administrator
 *
 */
public interface DictionariesDao {

	/**
	 * id查询
	 * 
	 * @param dictionariesId
	 * @return
	 */
	public List<Dictionaries> queryDictionaries(int dictionariesId);

	/**
	 * 编号查询
	 * 
	 * @param encoding
	 * @return
	 */
	public List<Dictionaries> queryDictionariesList(String encoding);
}
