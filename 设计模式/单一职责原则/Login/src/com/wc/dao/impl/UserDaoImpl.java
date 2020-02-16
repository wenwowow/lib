package com.wc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.wc.dao.UserDao;
import com.wc.domin.User;
import com.wc.utils.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUser(String userName, String userPassword) {
		String sql = "SELECT * FROM user WHERE username=?&&password=?";
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = DBUtil.getConn();
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, userName);
			pstat.setString(2, userPassword);
			rs = pstat.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setUid(rs.getString("uid"));
				user.setUsername(userName);
				user.setPassword(userPassword);
				user.setEmail(rs.getString("email"));
				user.setTelephone(rs.getString("telephone"));
				user.setBirthday(rs.getString("birthday"));
				user.setSex(rs.getString("sex"));
				user.setState(rs.getInt("state"));
			}else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeResource(pstat, conn, rs);
		}
		return user;
	}

}
