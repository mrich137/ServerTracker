package ServerTracker;

public class AbstractEntity {
	/*** START MEMBERS ***/
	private int entityId;
	private String entityName;
	//private String entityDesc;
	/*** END MEMBERS ***/
	

	/*** START CONSTRUCTORS ***/
	protected AbstractEntity(int id){ entityId = id; }
	protected AbstractEntity(String name){ entityName = name; }
	protected AbstractEntity(int id, String name){ entityId = id; entityName = name; }
	
	/*
	public Program(int id, String name, String desc){
		entityId = id;
		entityName = name;
		entityDesc = desc;
	}
	*/
	/*** END CONSTRUCTORS ***/
	
	
	/*** START METHODS ***/	
	protected int getEntityId() { return entityId; }
	protected void setEntityId(int entityId) { this.entityId = entityId; }
	protected String getEntityName() { return entityName; }
	protected void setEntityName(String entityName) { this.entityName = entityName; }
	
	protected void printEntity(){
		//System.out.println("ID:\t" + getEntityId());
		System.out.println("Name:\t" + getEntityName());
	}
	/*
	public String getEntityDesc() { return entityDesc; }
	public void setEntityDesc(String entityDesc) { this.entityDesc = entityDesc; }
	*/
	/*** END METHODS ***/
}
