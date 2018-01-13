package com.lxit.p2p.action;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.p2p.bean.Dictionaries;
import com.lxit.p2p.service.DictionariesService;


@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lxit.p2p.service")
public class DictionariesAction {

	@Resource
	DictionariesService dictionariesService;
	
	@RequestMapping("/queryMapDictionaries")
	public List<Dictionaries> queryMapDictionaries(String encoding){
		List<Dictionaries> dictionariesLsit=dictionariesService.queryDictionariesList(encoding);
		return dictionariesLsit;
	}
}
