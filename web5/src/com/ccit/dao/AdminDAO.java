package com.ccit.dao;
import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;
import com.ccit.entity.MyBuild;
import com.ccit.sta.Admin;


public class AdminDAO {
	DBHelper<Admin> db = new DBHelper<>(Entity.URL);
	Build<Admin> b = new MyBuild<>(Admin.class);
	public boolean find(String name,String pwd){
		String sql = "select `id`,`name`,`password`from`admin`where`name`=?and`password`=? ";
		Admin ad = db.getQuery(sql, b, name,pwd);
		return ad != null;
	}

}
