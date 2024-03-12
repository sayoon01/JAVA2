
public class BodyData {
	private int weight;
	private int height;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public BodyData(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public int idealWeight() {
		return (height - 110);
	}
	
	public boolean needDiet() {
		if(weight > idealWeight())
			return true;
		else
			return false;
	}
	
	public boolean isTallerThan(BodyData b) {
		if(this.height >= b.height)
			return true;
		else
			return false;
	}
	
}
