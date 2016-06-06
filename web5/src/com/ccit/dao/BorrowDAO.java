package com.ccit.dao;



import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;
import com.ccit.entity.MyBuild;
import com.ccit.sta.Borrow;

public class BorrowDAO {
	DBHelper<Borrow> db = new DBHelper<>(Entity.URL);
	Build<Borrow> b = new MyBuild<>(Borrow.class);

	public boolean add(Borrow b) {
		String sql = "insert into `borrow`(`bid`,`cid`,`time`)values(?,?,?)";
		int i = db.getUpdate(sql, b.getBid(), b.getCid(), b.getTime());
		return i == 1;
	}

	public boolean delete(Borrow b) {
		String sql = "delete from `borrow`where `bid`=?";
		int i = db.getUpdate(sql, b.getBid());
		return i == 1;
	}
	public Borrow find(Borrow bo){
		String sql = "select `id`,`bid`,`cid`,`time`from`borrow` where `cid`=?";
		return db.getQuery(sql, b, bo.getCid());
	}
	
}
