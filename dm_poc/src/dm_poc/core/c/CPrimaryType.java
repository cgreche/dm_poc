package dm_poc.core.c;

public class CPrimaryType implements CType {
	
	final String identifier;
	
	private int sizeByIdentifier(String identifier) {
		return 0;
	}
	
	CPrimaryType(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String identifier() {
		return identifier;
	}

	@Override
	public int size() {
		return sizeByIdentifier(identifier);
	}

}
