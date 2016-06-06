package com.ccit.dao;

import java.util.List;

import com.ccit.entity.Build;
import com.ccit.entity.DBHelper;
import com.ccit.entity.Entity;
import com.ccit.entity.MyBuild;
import com.ccit.sta.Book;

public class BookDAO {
	DBHelper<Book> db = new DBHelper<>(Entity.URL);
	Build<Book> b = new MyBuild<>(Book.class);

	public boolean addBook(Book b) {
		String sql = "insert into `book`(`code`,`title`,`author`,`publishing`,`total`,`count`)values(?,?,?,?,?,?)";
		int i = db.getUpdate(sql, b.getCode(), b.getTitle(), b.getAuthor(),
				b.getPublishing(), b.getTotal(), b.getCount());
		return i == 1;
	}

	public boolean alterBook(Book b) {
		String sql = "update `book` set `code`=?,`author`=?,`publishing`=?,`total`=?,`count`=? where`id`=?";
		int i = db.getUpdate(sql, b.getCode(), b.getAuthor(),
				b.getPublishing(), b.getTotal(), b.getCount(), b.getId());
		return i == 1;
	}

	public boolean deleteBook(int id) {
		String sql = "delete from `book` where `id`=?";
		int i = db.getUpdate(sql, id);
		return i == 1;
	}

	public Book findOne(String code) {
		String sql = "select `id`,`code`,`title`,`author`,`publishing`,`total`,`count` from `book`where`code`=? ";
		return db.getQuery(sql, b, code);
	}

	public List<Book> findBooks(String str) {
		String sql = "select  `id`,`code`,`title`,`author`,`publishing`,`total`,`count` from`book`where `title`like '%"
				+ str
				+ "%' or `code` like '%"
				+ str
				+ "%' or `author` like '%"
				+ str + "%'";
		return db.getQueryAll(sql, b);
	}

	public List<Book> findAll() {
		String sql = "select `id`,`code`,`title`,`author`,`publishing`,`total`,`count` from`book`";
		return db.getQueryAll(sql, b);
	}

	public List<Book> findAllBycode(String code) {
		String sql = "SELECT book.* FROM borrow "
				+ "INNER JOIN card ON borrow.cid = card.id"
				+ "INNER JOIN book ON borrow.cid = book.id where `code`=?";
		return db.getQueryAll(sql, b, code);

	}

	public boolean save(Book b) {
		String sql = "update `book` set `count`=?where`id`=?";
		int i = db.getUpdate(sql, b.getCount(), b.getId());
		return i == 1;

	}

}
