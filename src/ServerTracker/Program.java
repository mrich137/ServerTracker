package ServerTracker;

public class Program {

	/*** START MEMBERS ***/
	private static int numPrograms = 0;
	private int programId;
	private String programName;
	//private String programDesc;
	/*** END MEMBERS ***/
	

	/*** START CONSTRUCTORS ***/
	public Program(){ programId = incProgramCount(); }
	
	public Program(String name){
		programId = incProgramCount();
		programName = name;
	}
	
	/*
	public Program(int id, String name, String desc){
		programId = id;
		programName = name;
		programDesc = desc;
	}
	*/
	/*** END CONSTRUCTORS ***/
	
	
	
	/*** START METHODS ***/	
	public int getProgramId() { return programId; }
	public String getProgramName() { return programName; }
	public void setProgramName(String programName) { this.programName = programName; }
	
	protected int incProgramCount(){ return ++numPrograms; }
	
	public void printProgram(){
		System.out.println("\tPID:\t" + getProgramId());
		System.out.println("\tName:\t" + getProgramName() + "\n");
	}
	
	/*
	public void setProgramId(int programId) { this.programId = programId; }
	public String getProgramDesc() { return programDesc; }
	public void setProgramDesc(String programDesc) { this.programDesc = programDesc; }
	*/
	/*** END METHODS ***/
}
