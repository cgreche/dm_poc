package dm_poc.core;

public class DirectDataAccessor extends AbstractDataAccessor {
	
	public DirectDataAccessor(int address) {
		super(address);
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
