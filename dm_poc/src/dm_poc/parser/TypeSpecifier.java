package dm_poc.parser;

import dm_poc.core.c.CType;

public class TypeSpecifier {
	enum Type {
		VOID,
		CHAR,
		INT,
		SHORT,
		LONG,
		UNSIGNED,
		SIGNED,
		FLOAT,
		DOUBLE,
		STRUCT,
		UNION
	}
	
	Type type;
	TypeSpecifier next;
	
	public CType build() {
		//TODO
		return null;
	}
}
