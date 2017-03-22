package org.eurokids.doa;


import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eurokids.db.DbUtils;
import org.eurokids.model.Admin;



import java.sql.*;;

public class DataAccess {
	public void insertAdmin(Admin ad){
		try{
			PreparedStatement ps =DbUtils.getPreparedStatement("insert into admin(username,email,password,status) values(?,?,?,?)");
			ps.setString(1,ad.getUsername());
			ps.setString(2,ad.getEmail());
			ps.setString(3,ad.getPassword());
			ps.setInt(4,ad.getStatus());
			ps.execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public List<Admin> getAll(){
		List<Admin> listOfAdmin = new LinkedList<>();
		try {
			ResultSet rs =DbUtils.getPreparedStatement("select * from admin").executeQuery();
			while(rs.next()){
				Admin ad = new Admin(rs.getInt("id"),rs.getString("username"), rs.getString("email"), rs.getString("password"), rs.getInt("status"));
				listOfAdmin.add(ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfAdmin;
 	}
	public Admin getAdminForLogin(String username,String password){
		Admin ad =new Admin();
		String sql="select * from admin where username =? and password=?";
		try {
			PreparedStatement ps =DbUtils.getPreparedStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ad = new Admin(rs.getString("username"), rs.getString("email"), rs.getString("password"), rs.getInt("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ad;
	}
	public Admin getAdminById(int id){
		Admin ad =new Admin();
		String sql="select * from admin where id=?";
		try {
			PreparedStatement ps =DbUtils.getPreparedStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ad = new Admin(rs.getString("username"), rs.getString("email"), rs.getString("password"), rs.getInt("status"));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ad;
		
	}
	public void updateAdmin(int id, Admin ad){
		String sql="update admin set username=?, email=?, password=? where id=?";
		try {
			PreparedStatement ps =DbUtils.getPreparedStatement(sql);
			ps.setString(1, ad.getUsername());
			ps.setString(2, ad.getEmail());
			ps.setString(3, ad.getPassword());
			
			ps.setInt(4,ad.getId());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteAdmin(int id){
		String sql="delete from admin where id=?";
		try {
			PreparedStatement ps=DbUtils.getPreparedStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
