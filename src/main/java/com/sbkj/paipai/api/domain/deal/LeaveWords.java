package com.sbkj.paipai.api.domain.deal;

/**
 * 订单留言记录
 * @author DOmmy
 * create:2014-08-08
 */
public class LeaveWords {
	private String wordId;// string  留言id 
	private String leaveTime;// date  留言时间 
	private String leaveWord_TODO;// string  留言内容 
	private String leaveUin;// number  留言者uin 
	private String leaveNick;// string  留言在昵称 
	private String replierUin;// number  被留言在uin 
	private String replierNick;// string  被留言在昵称 
	
	public String getWordId() {
		return wordId;
	}
	public void setWordId(String wordId) {
		this.wordId = wordId;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getLeaveWord_TODO() {
		return leaveWord_TODO;
	}
	public void setLeaveWord_TODO(String leaveWord_TODO) {
		this.leaveWord_TODO = leaveWord_TODO;
	}
	public String getLeaveUin() {
		return leaveUin;
	}
	public void setLeaveUin(String leaveUin) {
		this.leaveUin = leaveUin;
	}
	public String getLeaveNick() {
		return leaveNick;
	}
	public void setLeaveNick(String leaveNick) {
		this.leaveNick = leaveNick;
	}
	public String getReplierUin() {
		return replierUin;
	}
	public void setReplierUin(String replierUin) {
		this.replierUin = replierUin;
	}
	public String getReplierNick() {
		return replierNick;
	}
	public void setReplierNick(String replierNick) {
		this.replierNick = replierNick;
	}

}
