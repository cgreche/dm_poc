package dm_poc.core.c;

public class CStructType implements CType {
	CStructField fields[];
	
	public CStructType(CStructField fields[]) {
		this.fields = fields;
	}
	
	public CStructField field(String name) {
		//TODO
		return null;
	}
	
	public CStructField[] fields() {
		return fields;
	}

	@Override
	public String identifier() {
		return "STRUCT";
	}

	@Override
	public int size() {
		int size = 0;
		for(CStructField field : fields) {
			size += field.size();
		}
		return size;
	}

}
