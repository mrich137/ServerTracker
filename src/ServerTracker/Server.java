package ServerTracker;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	/*** START MEMBERS ***/
	private static int numServers = 0;
	private int serverId;
	private String serverName;
	private String serverIp;
	private List<Program> programList = new ArrayList<Program>();
	//private String serverDesc;
	/*** END MEMBERS ***/
	
	
	/*** START CONSTRUCTORS ***/
	public Server(){ serverId = incServerCount(); }
	
	public Server(String serverName){
		this.serverId = incServerCount();
		this.serverName = serverName;
	}
	
	public Server(String serverName, String serverIp){
		this.serverId = incServerCount();
		this.serverName = serverName;
		this.serverIp = serverIp;
	}
	/*** END CONSTRUCTORS ***/
	
	
	/*** START METHODS ***/
	public int getServerId() { return serverId; }
	
	public String getServerName() { return serverName; }
	public void setServerName(String serverName) { this.serverName = serverName; }
	
	public String getServerIp() { return serverIp; }
	public void setServerIp(String serverIp) { this.serverIp = serverIp; }
	
	public List<Program> getProgramList() { return programList; }
	public void setProgramList(List<Program> programList) {	this.programList = programList;	}
	
	public void addProgram(Program p) {	this.programList.add(p); }
	
	public int incServerCount(){ return ++numServers; }
	
	public void printServer(){
		System.out.println("SID:\t" + getServerId());
		System.out.println("Name:\t" + getServerName());
		System.out.println("IP:\t" + getServerIp() + "\n");
		
		for(Program p : programList){
			p.printProgram();
		}
	}
	
	/*
	public String getServerDesc() { return serverDesc; }
	public void setServerDesc(String serverDesc) { this.serverDesc = serverDesc; }
	public void setServerId(int serverId) { this.serverId = serverId; }
	*/
	/*** END METHODS ***/
	
	
	/*** START MAIN ***/
	public static void main(String args[]){
		
		Server serv1 = new Server("Server1", "127.0.0.1");
		
		Program progA = new Program("ProgramA");
		Program progB = new Program("ProgramB");
		
		serv1.addProgram(progA);
		serv1.addProgram(progB);
		
		Server serv2 = new Server();
		serv2.setServerName("Server2");
		serv2.setServerIp("127.0.0.2");
		
		serv2.addProgram(progB);
		
		serv1.printServer();
		serv2.printServer();
	}
	/*** END MAIN ***/	
}
