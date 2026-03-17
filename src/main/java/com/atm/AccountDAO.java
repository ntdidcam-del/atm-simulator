package com.at.dao;
import com.atm.model.Account;
import com.atm.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class AccountDAO{
    public Account getAccount(int accountId) throws Exception {
        Connection conn = DBConnection.getConnection();

        PreparedStatement ps = 
        conn.prepareStatement("SELECT * FROM accounts WHERE account_id=?");

        ps.setInt(1, accountId);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            return new Account(
                rs.getInt("account_id"),
                rs.getString("name"),
                rs.getInt("pin"),
                rs.getDouble("balance")
            );
        }
        return null;
    }
}