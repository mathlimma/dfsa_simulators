package general;

import estimators.LowerBound;

public class Controller {
	
	private LowerBound lb;  //must be an arraylist of simulators in the future
	
	private int inicialNumberTags;
	private int incrementTagsBy;
	private int maxNumberTags;
	private int repetitionsEachNumberTags;
	private int inicialFrameSize;
	
	public Controller (int iniNumTags, int incTagsBy,
		int maxNumTags, int numRepet, int iniFrameSize) {
		
		this.inicialNumberTags = iniNumTags;
		this.incrementTagsBy = incTagsBy;
		this.maxNumberTags = maxNumTags;
		this.repetitionsEachNumberTags = numRepet;
		this.inicialFrameSize = iniFrameSize;
		
		this.lb = new LowerBound(iniNumTags,iniFrameSize);
		
	}
	
	public void resetlb(int iniNumTags,int iniFrameSize) {
		this.lb = new LowerBound(iniNumTags,iniFrameSize);
	}
	
	public void runEstimator() {
		
		int numberTags = this.inicialNumberTags;
		
		while(numberTags<=this.maxNumberTags) {
			
			this.resetlb(numberTags, this.inicialFrameSize); 
			
			for(int i=0;i<this.repetitionsEachNumberTags;i++) {
				this.lb.simulate();
				
				this.resetlb(numberTags, this.inicialFrameSize);
			}
			
			numberTags+=this.incrementTagsBy;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
