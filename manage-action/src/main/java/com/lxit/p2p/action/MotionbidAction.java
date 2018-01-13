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

import com.lxit.p2p.bean.Motionbid;
import com.lxit.p2p.bean.Pager;
import com.lxit.p2p.service.MotionbidService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lxit.p2p.service")
public class MotionbidAction {

	@Resource
	MotionbidService motionbidService;

	@RequestMapping("/addMotionbidMethod")
	public String addMotionbidMethod(@RequestBody(required = false) Motionbid motionbid) {
		if (motionbidService.addMotionbid(motionbid) > 0) {
			System.out.println("成功---------------");
			return "true";
		} else {
			System.out.println("失败---------------");
			return "false";
		}
	}

	@RequestMapping("/queryMotionbidMethod")
	public List<Motionbid> queryMotionbidMethod() {
		List<Motionbid> motionbidList = motionbidService.queryMotionbid();
		return motionbidList;
	}

	@RequestMapping("/queryMapMotionbidMethod")
	public Pager<Motionbid> queryMapMotionbidMethod(int page, int rows,int userId) {
		Map<String, Object> map = new HashMap<>();
		Pager<Motionbid> pager = new Pager<>();
		pager.setPageIndex(page);
		pager.setPageSize(rows);
		int pageIndex = (pager.getPageIndex() - 1) * rows;
		map.put("pageIndex", pageIndex);
		map.put("pageSize", rows);
		map.put("userId", userId);
		int count = motionbidService.queryCountMotionbid(map);
		pager.setSumCount(count);
		List<Motionbid> list = motionbidService.queryMapMotionbid(map);
		pager.setData(list);
		return pager;
	}
	
	@RequestMapping("/queryTimeMotionbidMethod")
	public Motionbid queryTimeMotionbidMethod(int userId){
		Motionbid motionbid=motionbidService.queryMapMotionbidTime(userId);
		return motionbid;
	}
	
	@RequestMapping("/updateMotionbidTimeMethod")
	public String updateMotionbidTimeMethod(@RequestBody(required = false) Motionbid motionbid){
		if(motionbidService.updateMotionbidTime(motionbid)){
			System.out.println("/-/-/-/-/-/-/-/-/-/-成功");
			return "true";
		}else{
			System.out.println("-/-/-//-/-/-/-/-/-失败");
			return "false";
		}
	}

}
