package com.lxit.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.Motionbid;
import com.lxit.p2p.dao.MotionbidDao;
import com.lxit.p2p.service.MotionbidService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class MotionbidServiceImpl implements MotionbidService {

	@Resource
	MotionbidDao motionbidDao;

	@Override
	public List<Motionbid> queryMotionbid() {
		return motionbidDao.queryMotionbid();
	}

	@Override
	public int addMotionbid(Motionbid motionbid) {
		return motionbidDao.addMotionbid(motionbid);
	}

	@Override
	public int updateMotionbid(Motionbid motionbid) {
		return motionbidDao.updateMotionbid(motionbid);
	}

	@Override
	public int deleteMotionbid(int motionbidId) {
		return motionbidDao.deleteMotionbid(motionbidId);
	}

	@Override
	public List<Motionbid> queryMapMotionbid(Map<String, Object> map) {
		return motionbidDao.queryMapMotionbid(map);
	}

	@Override
	public int queryCountMotionbid(Map<String, Object> map) {
		return motionbidDao.queryCountMotionbid(map);
	}

	@Override
	public Motionbid queryMapMotionbidTime(int userId) {
		return motionbidDao.queryMapMotionbidTime(userId);
	}

	@Override
	public boolean updateMotionbidTime(Motionbid motionbid) {
		return motionbidDao.updateMotionbidTime(motionbid);
	}

}
