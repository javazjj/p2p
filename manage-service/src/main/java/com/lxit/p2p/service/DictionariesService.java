package com.lxit.p2p.service;

import java.util.List;

import com.lxit.p2p.bean.Dictionaries;

public interface DictionariesService {

	/**
	 * id��ѯ
	 * 
	 * @param dictionariesId
	 * @return
	 */
	public List<Dictionaries> queryDictionaries(int dictionariesId);

	/**
	 * ��Ų�ѯ
	 * 
	 * @param encoding
	 * @return
	 */
	public List<Dictionaries> queryDictionariesList(String encoding);
}
