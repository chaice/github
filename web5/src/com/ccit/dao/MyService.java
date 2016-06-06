package com.ccit.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.ccit.entity.Entity;

public class MyService {
	public String bo_bor( String bookcode, String cardcode) {
		return boDAO("{call pro_bro(?,?,?)}", bookcode, cardcode);
	}

	public String bo_ret(String bookcode, String cardcode) {
        return boDAO("{call pro_re(?,?,?)}",bookcode,cardcode);
	}

	public String boDAO(String sql, String bookcode, String cardcode) {
		String mes = "";
		try {
			Connection con = DriverManager.getConnection(Entity.URL);
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, bookcode);
			cs.setString(2, cardcode);
			cs.executeQuery();
			mes = cs.getString(3);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mes;
	}
}
