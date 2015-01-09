package ServerTracker;

public class Program extends AbstractEntity{

	//public Program() { super(); }

	public Program(int id){ super(id); }
	public Program(String name) { super(name); }
	public Program(int id, String name){ super(id,name); }
	
	
	/*** START METHODS ***/	
	public int getProgramId() { return this.getEntityId(); }
	public void setProgramId(int id) { this.setEntityId(id); }
	public String getProgramName() { return this.getEntityName(); }
	public void setProgramName(String programName) { this.setEntityName(programName); }
	
	
	public void printProgram(){ 
		System.out.print("Program ");
		this.printEntity(); 
	}
	
	/*
	public void setEntityId(int programId) { this.entityId = programId; }
	public String getEntityDesc() { return entityDesc; }
	public void setEntityDesc(String entityDesc) { this.entityDesc = entityDesc; }
	*/
	/*** END METHODS ***/
}