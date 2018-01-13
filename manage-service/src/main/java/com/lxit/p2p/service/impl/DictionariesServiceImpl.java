package com.lxit.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.Dictionaries;
import com.lxit.p2p.dao.DictionariesDao;
import com.lxit.p2p.service.DictionariesService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class DictionariesServiceImpl implements DictionariesService {

	@Resource
	DictionariesDao dictionariesDao;

	@Override
	public List<Dictionaries> queryDictionaries(int dictionariesId) {
		return dictionariesDao.queryDictionaries(dictionariesId);
	}

	@Override
	public List<Dictionaries> queryDictionariesList(String encoding) {
		return dictionariesDao.queryDictionariesList(encoding);
	}

}
