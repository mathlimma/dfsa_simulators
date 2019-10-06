package general;
import java.util.Random;

public class Tag {
	
	private int id;
	private int randomNumber;
	
	public Tag (int id, int frameSize) {
		this.id = id;
		this.randomNumber = new Random().nextInt(frameSize);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	 
}
