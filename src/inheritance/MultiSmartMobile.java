package inheritance;

public class MultiSmartMobile extends MultiMobile {
	
	private String touch;
	private boolean iswireLess;
	public MultiSmartMobile(String brand, int price, String model, String touch, boolean iswireLess) {
		super(brand, price, model);
		this.touch = touch;
		this.iswireLess = iswireLess;
	}
	public String getTouch() {
		return touch;
	}
	public void setTouch(String touch) {
		this.touch = touch;
	}
	public boolean isIswireLess() {
		return iswireLess;
	}
	public void setIswireLess(boolean iswireLess) {
		this.iswireLess = iswireLess;
	}
	@Override
	public String toString() {
		return super.toString()+"[touch=" + touch + ", iswireLess=" + iswireLess + "]";
	}
	

}
