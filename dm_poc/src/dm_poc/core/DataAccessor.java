package dm_poc.core;

public interface DataAccessor {
	public void write(byte[] data, int length);
	public byte[] read(int length);
}
