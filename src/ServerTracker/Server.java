package ServerTracker;

import java.util.ArrayList;
import java.util.List;

public class Server extends AbstractEntity{
	
	/*** START MEMBERS ***/
	private String serverIp;
	private List<Program> programList = new ArrayList<Program>();
	/*** END MEMBERS ***/
	
	
	/*** START CONSTRUCTORS ***/
	public Server(int id){ super(id); }
	public Server(String name){ super(name); }
	public Server(int id, String name){ super(id, name); }
	public Server(String name, String ip){ super(name); serverIp = ip; }
	public Server(int id, String name, String ip){ super(id, name);	this.serverIp = ip;	}
	/*** END CONSTRUCTORS ***/
	
	
	/*** START METHODS ***/
	public int getServerId() { return this.getEntityId(); }
	public void setServerId(int id){ this.setEntityId(id); }
	public String getServerName() { return this.getEntityName(); }
	public void setServerName(String name) { this.setEntityName(name); }
	public String getServerIp() { return this.serverIp; }
	public void setServerIp(String serverIp) { this.serverIp = serverIp; }
	public List<Program> getProgramList() { return this.programList; }
	public void setProgramList(List<Program> programList) {	this.programList = programList;	}
	public void addProgram(Program p) {	this.programList.add(p); }
	
	public void printServer(){
		System.out.print("Server ");
		super.printEntity();
		System.out.println("IP Address:\t" + this.getServerIp());
		System.out.println("\nINSTALLED PROGRAMS:");
		for(Program p : programList){
			p.printProgram();
		}
		System.out.println("\n------------------------------------------------\n");
	}
	
	/*
	public String getServerDesc() { return serverDesc; }
	public void setServerDesc(String serverDesc) { this.serverDesc = serverDesc; }
	public void setServerId(int serverId) { this.serverId = serverId; }
	*/
	/*** END METHODS ***/
	
	
	/*** START MAIN ***/
	public static void main(String args[]){
		
		Program progA = new Program("ProgramA");
		Program progB = new Program("ProgramB");
		Program progC = new Program("ProgramC");
		Program progD = new Program("ProgramD");
		
		Server serv1 = new Server("Server1", "127.0.0.1");
		serv1.addProgram(progA);
		serv1.addProgram(progB);
		serv1.addProgram(progD);
		
		Server serv2 = new Server("Server2");
		serv2.setServerIp("127.0.0.2");
		serv2.addProgram(progB);
		serv2.addProgram(progC);
		
		Server serv3 = new Server("Server3", "127.0.0.3");
		
		serv1.printServer();
		serv2.printServer();
		serv3.printServer();
	}
	/*** END MAIN ***/	
}