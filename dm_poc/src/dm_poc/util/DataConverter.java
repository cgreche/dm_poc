package dm_poc.util;

public class DataConverter {
	byte[] data;
	
	public <O> byte[] fromType(O data) {
		return (byte[])data;
	}
	
	public <O> O asType(byte[] data) {
		return (O)data;
	}
	
}
