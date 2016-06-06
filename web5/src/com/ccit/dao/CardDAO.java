package com.ccit.dao;

import java.util.List;

import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;
import com.ccit.entity.MyBuild;
import com.ccit.sta.Card;

public class CardDAO {
	DBHelper<Card> db = new DBHelper<>(Entity.URL);
	Build<Card> b = new MyBuild<>(Card.class);
	public boolean add(Card c){
		String sql = "insert into `card`(`code`,`name`,`tel`)values(?,?,?)";
		int i = db.getUpdate(sql, c.getCode(),c.getName(),c.getTel());
		return i==1;
	}
	public boolean remove(int id){
		String sql = "delete from `card` where `id`=?";
		int i = db.getUpdate(sql,id);
		return i==1;
	}
	
	public Card find(String code){
		String sql = "select `id`,`name`,`code`,`tel`from`card`where `code`=?";
		Card c = db.getQuery(sql, b, code);
		return c;
	}
	public List<Card> findAll( ){
		String sql = "select `id`,`name`,`code`,`tel`from`card`";
		return db.getQueryAll(sql, b);
	}
	public boolean alterCard(Card c){
		String sql = "update `card` set `code`=?,`name`=?,`tel`=? where`id`=?";
		int i = db.getUpdate(sql, c.getCode(),c.getName(),c.getTel(),c.getId());
		return i==1;
	}
}
