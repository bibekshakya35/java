package org.eurokids.doa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import org.eurokids.db.DbUtils;
import org.eurokids.model.Page;

public class PageDt {
	
	public void InsertPage(Page pg){
		try {
			PreparedStatement ps= DbUtils.getPreparedStatement("insert into page values(?,?,?,?,?,?,?,?)");
			ps.setString(1,pg.getTitle());
			ps.setString(2,pg.getDate());
			ps.setString(3, pg.getDescription());
			ps.setString(4, pg.getDetail());
			ps.setString(5, pg.getCategory());
			ps.setInt(6, pg.getStatus());
			ps.setString(7, pg.getImage());
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public List<Page> getAll(){
		List<Page> pageList=new LinkedList<>();
		String sql="select * From page";
		try {
			PreparedStatement ps =DbUtils.getPreparedStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Page pg =new Page(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),rs.getInt(7),rs.getString(8));
				pageList.add(pg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pageList;
		
	}
	public Page getById(int id){
		Page pg=null;
		String sql ="Select * from page where id =?";
		try {
			PreparedStatement ps =DbUtils.getPreparedStatement(sql);
			ps.setInt(1,id);
			ResultSet rs =ps.executeQuery();
			while(rs.next()){
				pg = new Page(rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pg;
	}
	public void updatePage(int id, Page pg){
		String sql="update page set title=?, date=?, description=?, details=?, category=?, status=?, image=? where id=?";
		try {
			PreparedStatement ps= DbUtils.getPreparedStatement(sql);
			ps.setString(1,pg.getTitle());
			ps.setString(2,pg.getDate());
			ps.setString(3, pg.getDescription());
			ps.setString(4, pg.getDetail());
			ps.setInt(5, pg.getStatus());
			ps.setString(6, pg.getImage());
			ps.execute();
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deletePage(int id){
		String sql ="Delete from page where id=?";
		try {
			PreparedStatement ps = DbUtils.getPreparedStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
