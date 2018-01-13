package com.lxit.p2p.dao;

import java.util.List;
import java.util.Map;
import com.lxit.p2p.bean.Motionbid;

/**
 * 自动投标
 * 
 * @author Administrator
 *
 */
public interface MotionbidDao {

	/**
	 * 查询
	 * 
	 * @return
	 */
	public List<Motionbid> queryMotionbid();

	/**
	 * 增加
	 * 
	 * @param motionbid
	 * @return
	 */
	public int addMotionbid(Motionbid motionbid);

	/**
	 * 修改
	 * 
	 * @param motionbid
	 * @return
	 */
	public int updateMotionbid(Motionbid motionbid);

	/**
	 * 删除
	 * 
	 * @param motionbidId
	 * @return
	 */
	public int deleteMotionbid(int motionbidId);
	
	/**
	 * 计算总页数
	 * @param map
	 * @return
	 */
	public int queryCountMotionbid(Map<String,Object> map);
	
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	public List<Motionbid> queryMapMotionbid(Map<String, Object> map);
	
	/**
	 * 查询记录
	 */
	public Motionbid queryMapMotionbidTime(int userId);
	
	
	/**
	 * 修改开关
	 * @param motionbid
	 * @return
	 */
	public boolean updateMotionbidTime(Motionbid motionbid);

}
