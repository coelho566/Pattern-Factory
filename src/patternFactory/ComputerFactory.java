package patternFactory;

public class ComputerFactory {

	public static Computer getComputer(String tipo, String ram, String hd, String cpu) {

		if ("Desktop".equalsIgnoreCase(tipo)) {
			
			return new Desktop(ram, hd, cpu);
			
		} else if ("NoteBook".equalsIgnoreCase(tipo)) {
			
			return new Notebook(hd, ram, cpu);
			
		} else if ("Server".equalsIgnoreCase(tipo)) {
			
			return new Server(ram, hd, cpu);
			
		}

		return null;
	}
}
