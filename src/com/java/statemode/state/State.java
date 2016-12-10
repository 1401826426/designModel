package com.java.statemode.state;

public abstract  class State {
	
	protected CandyMachine mCandyMachine  ; 
	public void setCandyMachine(CandyMachine mCandyMachine){
		this.mCandyMachine = mCandyMachine ; 
	}
	public abstract void insertCoin();
	public abstract void returnCoin();
	public abstract void turnCrank();
	public abstract void dispense();
	public abstract void printstate();
}
