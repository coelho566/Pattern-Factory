package patternFactory;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHd();
	public abstract String getCpu();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ram= "+this.getRam()+", Hd= "+this.getHd()+", Cpu= "+this.getCpu();
	}
}
