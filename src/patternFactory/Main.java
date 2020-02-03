package patternFactory;

public class Main {

	public static void main(String[] args) {
		
		Computer noteBook = ComputerFactory.getComputer("Notebook", "16 GB", "1 TB", "2.88 GHz");
		Computer desktop = ComputerFactory.getComputer("Desktop", "32 GB", " 2 TB", "3.88 GHz");
		Computer server = ComputerFactory.getComputer("Server", "16 GB", "1,5 TB", "2.44 GHz");
		
		System.out.println("Factory Notbook config: "+noteBook);
		System.out.println("Factory Desktop config: "+desktop);
		System.out.println("Factory Server config: "+server);

	}

}
