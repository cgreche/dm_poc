package dm_poc.core.c;

public class CStructField {
	
	private CType fieldType;
	private int bitField;
	private int offset;
	
	public CStructField(CType fieldType, int bitField, int offset) {
		this.fieldType = fieldType;
		this.bitField = bitField;
		this.offset = offset;
	}
	
	public int size() {
		return ((bitField/32) + (31 + (bitField%32))/32)*4;
	}
	
	public CType fieldType() {
		return fieldType;
	}
	
	public int bitField() {
		return bitField;
	}
	
	public int offset() {
		return offset;
	}
}
