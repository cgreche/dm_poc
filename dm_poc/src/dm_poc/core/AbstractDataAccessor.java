package dm_poc.core;

public abstract class AbstractDataAccessor implements DataAccessor {
	
	protected int dataAddress;
	
	AbstractDataAccessor(int dataAddress) {
		this.dataAddress = dataAddress;
	}
	
	public int dataAddress() {
		return dataAddress;
	}

}
