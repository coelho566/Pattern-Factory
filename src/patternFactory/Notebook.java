package patternFactory;

public class Notebook extends Computer {

	private String hd;
	private String ram;
	private String cpu;

	public Notebook(String hd, String ram, String cpu) {
		super();
		this.hd = hd;
		this.ram = ram;
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
