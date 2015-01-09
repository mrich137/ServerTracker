package ServerTracker.Sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ServerTracker.Program;
import ServerTracker.Server;

public class ServerSqlDriver {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	
	public ServerSqlDriver(){
		
	}
	
	public boolean openDbConnection(){return true;}
	public boolean closeDbConnection(){return true;}
	
	public boolean addServer(Server s){
		return false;
	}
	
	public Server removeServerByName(String servName){
		return new Server();
	}
	
	public Server removeServerById(int servId){
		return new Server();
	}
	
	public Program getProgramByServerName(String servName){
		return new Program();
	}
	
	public Program getProgramByServerId(int servId){
		return new Program();
	}
}
