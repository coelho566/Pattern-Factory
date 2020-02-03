package patternFactory;

public class Server extends Computer {

	private String ram;
	private String hd;
	private String cpu;

	public Server(String ram, String hd, String cpu) {
		super();
		this.ram = ram;
		this.hd = hd;
		this.cpu = cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHd() {
		// TODO Auto-generated method stub
		return hd;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return cpu;
	}

}
