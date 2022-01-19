package com.bridgelabz.assignment.day_3;

public class CoinFlip {

    int flipCoin;
    int headCount=0;
    int tailsCount=0;
	
	public void check() {
	for(int i=1;i<=10;i++)	{
		flipCoin=(int)Math.round (Math.random());
		if(flipCoin == 1) {
			//System.out.println("Heads");
			headCount = headCount+1;
		}
		
		else {
			//System.out.println("Tails");
			tailsCount = tailsCount+1;
		}
		}
	}
	
public void HeadPer() {
		float headPer = (headCount*100)/10;
	System.out.println("Head Percent :"+headPer);
	}
public void TailPer() {
	float tailsPer = (tailsCount*100)/10;
	System.out.println("Tails Percent : "+tailsPer);
	
}
	
	public static void main(String[] args) {
		CoinFlip cf = new CoinFlip();
		cf.check();
		cf.HeadPer();
		cf.TailPer();
		

	}

}
