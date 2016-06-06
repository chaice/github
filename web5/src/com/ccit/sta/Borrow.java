package com.ccit.sta;

import java.util.Date;

public class Borrow {
	private Integer id;
	private Integer bid;
	private Integer cid;
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Borrow [id=" + id + ", bid=" + bid + ", cid=" + cid + ", time="
				+ time + "]";
	}

}
