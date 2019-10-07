package estimators;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


import general.Tag;

public class LowerBound {
	
	private int numberTags;
	private int frameSize;
	private int[] frame;
	private List<Tag> tags;
	
	private double numberEmptySlots;
	private double numberCollisionSlots;
	private double numberSucessSlots;
	private int numberTotalSlots;
	private double efficiecy;
	private int totalFrames;
	
	public double getEfficiecy() {
		return efficiecy;
	}

	public void setEfficiecy(double efficiecy) {
		this.efficiecy = efficiecy;
	}

	public double getNumberEmptySlots() {
		return numberEmptySlots;
	}

	public void setNumberEmptySlots(double numberEmptySlots) {
		this.numberEmptySlots = numberEmptySlots;
	}

	public double getNumberCollisionSlots() {
		return numberCollisionSlots;
	}

	public void setNumberCollisionSlots(double numberCollisionSlots) {
		this.numberCollisionSlots = numberCollisionSlots;
	}

	public double getNumberSucessSlots() {
		return numberSucessSlots;
	}

	public void setNumberSucessSlots(double numberSucessSlots) {
		this.numberSucessSlots = numberSucessSlots;
	}

	public int getNumberTotalSlots() {
		return numberTotalSlots;
	}

	public void setNumberTotalSlots(int numberTotalSlots) {
		this.numberTotalSlots = numberTotalSlots;
	}

	public int getNumberTags() {
		return numberTags;
	}

	public void setNumberTags(int numberTags) {
		this.numberTags = numberTags;
	}

	public int getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}
	
	public void resetFrame(int frameSize) {
		this.frame = new int [frameSize];
	}
	
	public LowerBound(int numberTags, int frameSize) {
		this.numberTags = numberTags;
		this.frameSize = frameSize;
		this.frame =  new int[frameSize];
		
		this.tags = new ArrayList<Tag>(numberTags);
		//initializing tags
		 for (int i=0; i< this.numberTags;i++) {
			 this.tags.add(new Tag());
		 }
	}
	public void simulate () {
		
		while(!this.tags.isEmpty()){
			this.numberTotalSlots+=this.frameSize;
			
			for(Tag tg : this.tags) {
				this.frame[tg.getRandomNumber(this.frameSize)]++;
			}
			
			int frameCollisions=0;
			for(int i=0;i<frameSize;i++) {
				if(this.frame[i]==0) {
					this.numberEmptySlots++;
				}else if(this.frame[i]==1) {
					this.numberSucessSlots++;
					this.tags.remove(0);
				}else {
					this.numberCollisionSlots++;
					frameCollisions++;
				}
			}
			
			this.setFrameSize(frameCollisions * 2);
			this.resetFrame(this.frameSize);
			this.totalFrames++;
		}
		
		this.setEfficiecy(this.numberSucessSlots/this.numberTotalSlots);
		this.setNumberCollisionSlots(this.numberCollisionSlots/this.totalFrames);
		this.setNumberEmptySlots(this.numberEmptySlots/this.totalFrames);
		this.setNumberSucessSlots(this.numberSucessSlots/this.totalFrames);
	}

	public static void main(String[] args) {
		
		
	}

}
