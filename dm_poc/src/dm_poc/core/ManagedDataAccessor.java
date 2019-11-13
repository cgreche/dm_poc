package dm_poc.core;

public class ManagedDataAccessor extends AbstractDataAccessor {

	public ManagedDataAccessor(int dataAddress) {
		super(dataAddress);
	}

	@Override
	public void write(byte[] data, int length) {
		//TODO
	}

	@Override
	public byte[] read(int length) {
		//TODO
		return null;
	}

}
