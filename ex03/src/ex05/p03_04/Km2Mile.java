package ex05.p03_04;

public class Km2Mile extends Converter{

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() {
		return "kM";
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		return "Mile";
	}

}
