package com.java.statemode.state;

public class CandyMachine {

	public static final State mSoldOutState = new SoldOutState();
	public static final State mOnReadyState = new OnReadyState();
	public static final State mSoldState = new SoldState() ; 
	public static final State mHasCoin = new HasCoin() ; 
	
	
	private State state;
	private int count = 0;

	public CandyMachine(int count) {
		this.count = count;
		if (count > 0) {
			setState(mOnReadyState);
		} else {
			setState(mSoldOutState);
		}
	}

	public void setState(State state) {
		this.state = state;
		this.state.setCandyMachine(this);
	}

	public void insertCoin() {
		state.insertCoin();
	}

	public void returnCoin() {
		state.returnCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void releaseCandy() {

		// TODO Auto-generated method stub
		if (count > 0) {
			count = count - 1;
			System.out.println("a candy rolling out!");
		}

	}

	public int getCount() {
		return count;
	}

	public void printstate() {
		state.printstate();
	}
}
