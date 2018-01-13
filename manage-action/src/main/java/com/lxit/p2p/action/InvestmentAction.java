package com.lxit.p2p.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.p2p.bean.Investment;
import com.lxit.p2p.bean.ManageStatisticsLength;
import com.lxit.p2p.bean.Pager;
import com.lxit.p2p.service.InvestmentService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lxit.p2p.service")
public class InvestmentAction {

	@Resource
	InvestmentService investmentService;

	@RequestMapping("/queryMapInvestmentMethod")
	public Pager<Investment> queryMapInvestmentMethod(int page, int rows, String pot, String pou, String poStat,
			String loansState, int userId) {
		System.out.println(
				page + "**" + rows + "**" + pot + "**" + pou + "**" + poStat + "**" + loansState + "**" + userId);
		Map<String, Object> map = new HashMap<>();
		Pager<Investment> pager = new Pager<>();
		pager.setPageIndex(page);
		pager.setPageSize(rows);
		int pageIndex = (pager.getPageIndex() - 1) * rows;
		map.put("pageIndex", pageIndex);
		map.put("pageSize", rows);
		map.put("pagePot", pot);// 从时间开始
		map.put("pagePou", pou);// 到时间结束
		map.put("pagePoStat", poStat);// 状态
		map.put("userId", userId);
		map.put("loansState", loansState);
		int count = investmentService.queryCountInvestment(map);
		pager.setSumCount(count);
		List<Investment> list = investmentService.queryInvestmentList(map);
		pager.setData(list);
		return pager;

	}

	@RequestMapping("/updateListInvestmentMethod")
	public String updateListInvestmentMethod(@RequestBody(required = false) Investment investment) {
		System.out.println("-----------" + investment);
		if (investmentService.updateInvestment(investment) > 0) {
			System.out.println("修改成功----------");
			return "true";
		} else {
			System.out.println("修改失败----------");
			return "false";
		}
	}

	@RequestMapping("/queryMapInvestmentMethodIndex")
	public Pager<Investment> queryMapInvestmentMethodIndex(int page, int rows, String pot, String pou, String poStat,
			String loansState, int userId) {
		System.out.println(
				page + "--" + rows + "--" + pot + "--" + pou + "--" + poStat + "--" + loansState + "--" + userId);
		Map<String, Object> map = new HashMap<>();
		Pager<Investment> pager = new Pager<>();
		pager.setPageIndex(page);
		pager.setPageSize(rows);
		int pageIndex = (pager.getPageIndex() - 1) * rows;
		map.put("pageIndex", pageIndex);
		map.put("pageSize", rows);
		map.put("pagePot", pot);// 从时间开始
		map.put("pagePou", pou);// 到时间结束
		map.put("pagePoStat", poStat);// 状态
		map.put("userId", userId);
		map.put("loansState", loansState);
		int count = investmentService.queryCountInvestmentIndex(map);
		pager.setSumCount(count);
		List<Investment> list = investmentService.queryInvestmentListIndex(map);
		pager.setData(list);
		return pager;

	}

	@RequestMapping("/queryMapInvestmentMethodIndexMark")
	public Pager<Investment> queryMapInvestmentMethodIndexMark(int page, int rows, String pot, String pou,
			String poStat, int userId) {
		System.out.println(page + "--" + rows + "--" + pot + "--" + pou + "--" + poStat + "--" + userId);
		Map<String, Object> map = new HashMap<>();
		Pager<Investment> pager = new Pager<>();
		pager.setPageIndex(page);
		pager.setPageSize(rows);
		int pageIndex = (pager.getPageIndex() - 1) * rows;
		map.put("pageIndex", pageIndex);
		map.put("pageSize", rows);
		map.put("pagePot", pot);// 从时间开始
		map.put("pagePou", pou);// 到时间结束
		map.put("pagePoStat", poStat);// 状态
		map.put("userId", userId);
		int count = investmentService.queryCountInvestmentIndexMark(map);
		pager.setSumCount(count);
		List<Investment> list = investmentService.queryInvestmentListIndexMark(map);
		pager.setData(list);
		return pager;

	}

	@RequestMapping("/queryListManageStatisticsLength")
	public List<ManageStatisticsLength> queryListManageStatisticsLength(int userId) {
		List<ManageStatisticsLength> statiList = investmentService.queryManageStatisticsLength(userId);
		return statiList;
	}

}
