package comandos;

import control.Engine;


public abstract class Command {
	
	abstract public boolean execute(Engine engine);
	abstract public Command parse(String[ ] s);
	abstract public String textHelp();
	
}
