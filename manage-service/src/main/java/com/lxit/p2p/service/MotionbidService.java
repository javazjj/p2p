package com.lxit.p2p.service;

import java.util.List;
import java.util.Map;

import com.lxit.p2p.bean.Motionbid;

/**
 * �Զ�Ͷ��
 * 
 * @author Administrator
 *
 */
public interface MotionbidService {
	/**
	 * ��ѯ
	 * 
	 * @return
	 */
	public List<Motionbid> queryMotionbid();

	/**
	 * ����
	 * 
	 * @param motionbid
	 * @return
	 */
	public int addMotionbid(Motionbid motionbid);

	/**
	 * �޸�
	 * 
	 * @param motionbid
	 * @return
	 */
	public int updateMotionbid(Motionbid motionbid);

	/**
	 * ɾ��
	 * 
	 * @param motionbidId
	 * @return
	 */
	public int deleteMotionbid(int motionbidId);
	
	/**
	 * ������ҳ��
	 * @param map
	 * @return
	 */
	public int queryCountMotionbid(Map<String,Object> map);
	
	/**
	 * ��ҳ��ѯ
	 * @param map
	 * @return
	 */
	public List<Motionbid> queryMapMotionbid(Map<String,Object> map);
	
	/**
	 * ��ѯ��¼
	 */
	public Motionbid queryMapMotionbidTime(int userId);
	
	/**
	 * �޸Ŀ���
	 * @param motionbid
	 * @return
	 */
	public boolean updateMotionbidTime(Motionbid motionbid);

}
