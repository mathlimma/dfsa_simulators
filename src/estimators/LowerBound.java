package estimators;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


import general.Tag;

public class LowerBound {
	
	private int numberTags;
	private int frameSize;
	private List frame;
	private List tags;
	
	public LowerBound(int numberTags, int frameSize) {
		this.numberTags = numberTags;
		this.frameSize = frameSize;
		this.frame =  new ArrayList(frameSize);
		this.tags = new ArrayList(numberTags);
		
		 for (int i=0; i< this.numberTags;i++) {
			 this.tags.add(new Tag(i,frameSize));
		 }
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

	public static void main(String[] args) {
		

	}

}
