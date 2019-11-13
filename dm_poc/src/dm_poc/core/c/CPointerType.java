package dm_poc.core.c;

public class CPointerType implements CType {
	
	final CType pointedType;
	
	CPointerType(CType pointedType) {
		this.pointedType = pointedType;
	}

	@Override
	public String identifier() {
		return "POINTER";
	}

	@Override
	public int size() {
		return 4;
	}

}
