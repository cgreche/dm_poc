package dm_poc.core;

import dm_poc.core.c.CDeclaration;

public class ItemData {
	private CDeclaration declaration;
	private DataAccessor dataAccessor;
	
	public ItemData(CDeclaration declaration) {
		this(declaration,null);
	}
	
	public ItemData(CDeclaration declaration, DataAccessor dataAcessor) {
		this.declaration = declaration;
		this.dataAccessor = dataAcessor;
	}
	
	public void setDataAcessor(DataAccessor dataAccessor) {
		this.dataAccessor = dataAccessor;
	}
	
	public CDeclaration declaration() {
		return declaration;
	}
	
	public DataAccessor dataAcessor() {
		return dataAccessor;
	}
}
