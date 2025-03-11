package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import beans.Register;
import beans.Task;
import factory.DBconn;

public class ToDoDAOimpl implements ToDoDAO {
	
	static ToDoDAO toDoDAO;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt1,pstmt2,pstmt3,pstmt4;
	ResultSet rs;
	private ToDoDAOimpl() {
		try {
			con = DBconn.getConn();
			stmt = con.createStatement();
			pstmt1 = con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?,?,?)");
			pstmt2 = con.prepareStatement("INSERT INTO tasks VALUES (?,?,?,?,?)");
			pstmt2 = con.prepareStatement("INSERT INTO taskid_pks VALUES(?,?)");
			pstmt4 = con.prepareStatement"UPDATE taskid_pks SET taskid = ? WHERE regid =?");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// factory method that returns singleton object of this class
	public static ToDoDAO getinstance() {
		if(toDoDAO==null) {
			toDoDAO = new ToDoDAOimpl();
		}
		return toDoDAO;
	}

	@Override
	public int rigister(Register register) {
		// TODO Auto-generated method stub
		int regId = 0;
		try {
			rs = stmt.executeQuery("select max(regid) from register");
			if(rs.next()) {
				regId = rs.getInt(1);
				
			}
			regId++;
			
			pstmt1.setInt(1,  regId);
			pstmt1.setString(2, register.getFname());
			pstmt1.setString(3, register.getLname());
			pstmt1.setString(4, register.getEmail());
			pstmt1.setString(5, register.getPass());
			pstmt1.setLong(6, register.getMobile());
			pstmt1.setString(7, register.getAddress());
			int i = pstmt1.executeUpdate();
			if(i==1) {
				System.out.println("record inserted into register table : ");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int login(String email, String pass) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int regId = 0;
		try{
			rs = stmt.executeQuery("select regid from register where email =' "+email+"' and pass='"+pass+"'");
			if(rs.next()) {
				regId = rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return regId;
	}

	@Override
	public List<Task> findTaskByRegId(int regId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addTask(int regID, Task task) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean markTaskCompleted(int taskId, int regId) {
		// TODO Auto-generated method stub
		return false;
	}

}
