package dm_poc.core.c;

public class CArrayType extends CAggregateType {
	private CType elemType;
	private int elementCount;
	
	@Override
	public String identifier() {
		return "ARRAY";
	}
	
	@Override
	public int size() {
		return elemType.size() * elementCount;
	}
	
}
