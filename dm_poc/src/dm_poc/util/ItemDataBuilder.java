package dm_poc.util;

import dm_poc.core.DirectDataAccessor;
import dm_poc.core.ItemData;
import dm_poc.core.ManagedDataAccessor;
import dm_poc.core.c.CDeclaration;

public class ItemDataBuilder {
	
	enum DataAccessorImplIdentifier {
		DIRECT,
		MANAGED
	}
	
	private int address;
	private CDeclaration declaration;
	private DataAccessorImplIdentifier dataAccessorIdentifier;
	
	public ItemDataBuilder() {
		
	}
	
	public ItemDataBuilder address(int address) {
		this.address = address;
		return this;
	}
	
	public ItemDataBuilder declaration(CDeclaration declaration) {
		this.declaration = declaration;
		return this;
	}
	
	public ItemDataBuilder withDataAccessor(DataAccessorImplIdentifier dataAccessorIdentifier) {
		this.dataAccessorIdentifier = dataAccessorIdentifier;
		return this;
	}
	
	
	public ItemData build() {
		switch(this.dataAccessorIdentifier) {
			case DIRECT:
				return new ItemData(declaration,new DirectDataAccessor(address));
			case MANAGED:
				return new ItemData(declaration,new ManagedDataAccessor(address));
			default:
				return new ItemData(declaration);
		}
	}
}
