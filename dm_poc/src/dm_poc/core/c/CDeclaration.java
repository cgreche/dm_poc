package dm_poc.core.c;

public class CDeclaration {
	private String identifier;
	private CType type;
	//initializer?
	
	CDeclaration(String identifier, CType type) {
		this.identifier = identifier;
		this.type = type;
	}
	
	public String identifier() {
		return identifier;
	}
	
	public CType type() {
		return type;
	}
}
