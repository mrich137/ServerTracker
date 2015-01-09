package ServerTracker.Sql;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ServerTracker.*;

public class ProgramSqlDriver {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	
	public ProgramSqlDriver(){
		
	}
	
	public boolean addProgram(Program p){
		// Check to make sure no conflicting records
		
		// If doesn't already exist....
			//UPDATE PROGRAM table
			return true;
		// ELSE
			//return false;
	}
	
	public boolean openDbConnection(){return true;}
	public boolean closeDbConnection(){return true;}
	
	public Program removeProgramByName(String progName){
		return new Program();
	}
	
	public Program removeProgramById(int progId){
		return new Program();
	}
	
	public Server getServerByProgramName(String progName){
		return new Server();
	}
	
	public Server getServerByProgramId(int progId){
		return new Server();
	}
}
