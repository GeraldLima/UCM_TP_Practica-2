package logica.bytecode;

import logica.CPU;


public abstract class ByteCode {
	
	abstract public boolean execute(CPU cpu);
	abstract public ByteCode parse(String[ ] s);
}
